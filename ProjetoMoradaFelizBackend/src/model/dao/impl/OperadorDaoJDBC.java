package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import db.DB;
import db.DbException;
import model.Operador;
import model.dao.OperadorDao;

public class OperadorDaoJDBC implements OperadorDao {

	private Connection conn;
	
	public OperadorDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	@Override
	public Operador logar(Operador obj) {
		
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select * from operador " 
					+ "where nome = ? and senha = ? "
					);
			
			st.setString(1,obj.getNome());
			st.setString(2,obj.getSenha());
			rs = st.executeQuery();
			
			if(rs.next()) {
				Operador operador = instantiateOperador(rs);
				return operador;
			}
			
				return null;
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultset(rs);
			DB.closeStatement(st);
		}
		
	}
	
	
	
	@Override
	public void insert(Operador obj) {
	PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"insert into operador  " 
					+ "(nome,email,senha,cpf,rg,salario) "
					+ "values "
					+ "(?, ?, ?, ?, ?, ?)",
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getNome());
			st.setString(2, obj.getEmail());
			st.setString(3, obj.getSenha());
			st.setString(4, obj.getCpf());
			st.setString(5, obj.getRg());
			st.setDouble(6, obj.getSalario());
			
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
					int id = rs.getInt(1);
					obj.setId(id);
				}
				DB.closeResultset(rs);
			}else {
				throw new DbException("Unexpected error! No rows affected!");
			}
				
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			
			DB.closeStatement(st);
		}
		
	}
		
	

	@Override
	public void update(Operador obj) {
	PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"UPDATE operador  " 
					+ "SET nome = ?,  email = ?, senha =  md5('?') ,  cpf = ? , rg = ? , salario = ? "
					+ "where id = ? ");
			
			st.setString(1, obj.getNome());
			st.setString(2, obj.getEmail());
			st.setString(3, obj.getSenha());
			st.setString(4, obj.getCpf());
			st.setString(5, obj.getRg());
			st.setDouble(6, obj.getSalario());
			st.setInt(7, obj.getId());
			st.executeUpdate();
			
			
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			
			DB.closeStatement(st);
		}
		
		
	}

	@Override
	public void deleteById(Integer id) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"delete from operador " 
					+ "where id = ? "
					);
			
			st.setInt(1, id);
			st.executeUpdate();
				
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			
			DB.closeStatement(st);
		}
		
	}

	@Override
	public Operador findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select id , nome, email, md5(senha) , cpf, rg , salario from operador "
					);
			
			st.setInt(1, id);
			rs = st.executeQuery();
				if(rs.next()) {
					Operador operador = instantiateOperador(rs);
					
					return operador;
					
					}
				return null;		
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultset(rs);
			DB.closeStatement(st);
		}
		

	}
	

	private Operador instantiateOperador(ResultSet rs) throws SQLException {
		Operador operador = new Operador();
		operador.setId(rs.getInt("id"));
		operador.setNome(rs.getString("nome"));
		operador.setEmail(rs.getString("email"));
		operador.setCpf(rs.getString("cpf"));
		operador.setRg(rs.getString("rg"));
		operador.setSalario(rs.getDouble("salario"));
		
		return operador;
	}
	
	private Operador instantiateOperadorV(ResultSet rs, Operador op) throws SQLException {
		Operador operador = new Operador();
		operador.setId(rs.getInt("id"));
		operador.setNome(rs.getString("nome"));
		operador.setEmail(rs.getString("email"));
		operador.setCpf(rs.getString("cpf"));
		operador.setRg(rs.getString("rg"));
		operador.setSalario(rs.getDouble("salario"));
		
		return operador;
	}


	@Override
	public List<Operador> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select id , nome , email , md5(senha) , cpf , rg , salario from operador "
					+ "order by id "
						);
			
			
			rs = st.executeQuery();
			
			List<Operador> list = new ArrayList<>();
			
			Map<Integer, Operador> map = new HashMap<>();
			
			while (rs.next()) {
				
				Operador operador = map.get(rs.getInt("id"));
				
				if(operador == null) {
					operador = instantiateOperador(rs);
					map.put(rs.getInt("id"), operador);
					
				}
				Operador op = instantiateOperadorV(rs,operador);
				list.add(op);
				
				
			}
			
				
				return list;		
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeResultset(rs);
			DB.closeStatement(st);
		}
		
	
	}
	
	

}
