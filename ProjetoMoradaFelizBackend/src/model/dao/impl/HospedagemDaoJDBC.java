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
import model.Hospedagem;
import model.Reserva;
import model.dao.HospedagemDao;
import model.dao.OperadorDao;

public class HospedagemDaoJDBC implements HospedagemDao {

	private Connection conn;
	
	public HospedagemDaoJDBC(Connection conn) {
	this.conn = conn;
}
	
	@Override
	public void insert(Hospedagem obj) {
PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"insert into hospedar  " 
					+ "(hosp_nome ,  descricao , ocupa_max , preco ) "
					+ "values "
					+ "(?, ?, ?, ? )" ,
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getHosp_nome());
			st.setString(2, obj.getDescricao());
			st.setInt(3, obj.getOcupa_max());
			st.setDouble(4, obj.getPreco());
			
			
			
			int rowsAffected = st.executeUpdate();
			
			if(rowsAffected > 0) {
				ResultSet rs = st.getGeneratedKeys();
				if(rs.next()) {
				
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
	public void update(Hospedagem obj) {
	PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"UPDATE hospedar  " 
							+ "SET hosp_nome = ? ,  descricao = ? , ocupa_max = ? , preco = ?  "
							+ "where hosp_nome = ?"
							);
			
			st.setString(1, obj.getHosp_nome());
			st.setString(2, obj.getDescricao());
			st.setInt(3, obj.getOcupa_max());
			st.setDouble(4, obj.getPreco());
			st.setString(5, obj.getHosp_nome());
			

			st.executeUpdate();
			
			
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			
			DB.closeStatement(st);
		}
		
	}

	public Hospedagem findByName(String name) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select * from hospedar " 
					+ "where hosp_nome = ? "
					);
			
			st.setString(1, name );
			rs = st.executeQuery();
				if(rs.next()) {
					Hospedagem hospedagem = instantiateHospedagem(rs);
					
					return hospedagem;
					
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
	public List<Hospedagem> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select * from hospedar "
						);
			
			
			rs = st.executeQuery();
			
			List<Hospedagem> list = new ArrayList<>();
			
			Map<String, Hospedagem> map = new HashMap<>();
			
			while (rs.next()) {
				
				Hospedagem hospedagem = map.get(rs.getString("hosp_nome"));
				
				if(hospedagem == null) {
					hospedagem = instantiateHospedagem(rs);
					map.put(rs.getString("hosp_nome"), hospedagem);
					
				}
				Hospedagem op = instantiateHospedagemV(rs,hospedagem);
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
	

	@Override
	public void deleteByName(String name) {
		PreparedStatement st = null;

		try {
			st = conn.prepareStatement(
					"delete from hospedar " 
					+ "where hosp_nome = ? "
					);
			
			st.setString(1, name);
			st.executeUpdate();
				
		}
		catch (SQLException e){
			throw new DbException(e.getMessage());
		}
		finally {
			
			DB.closeStatement(st);
		}

		}
	


	
	
	private Hospedagem instantiateHospedagem(ResultSet rs) throws SQLException {
		Hospedagem hospedagem = new Hospedagem();
		hospedagem.setHosp_nome(rs.getString("hosp_nome"));
		hospedagem.setDescricao(rs.getString("descricao"));
		hospedagem.setOcupa_max(rs.getInt("ocupa_max"));
		hospedagem.setPreco(rs.getDouble("preco"));
	
		
		
		
		return hospedagem;
	}

		private Hospedagem instantiateHospedagemV(ResultSet rs, Hospedagem op) throws SQLException {
			Hospedagem hospedagem = new Hospedagem();
			hospedagem.setHosp_nome(rs.getString("hosp_nome"));
			hospedagem.setDescricao(rs.getString("descricao"));
			hospedagem.setOcupa_max(rs.getInt("ocupa_max"));
			hospedagem.setPreco(rs.getDouble("preco"));
		
			
			
			
			return hospedagem;
		

	}

		@Override
		public void confirma(Hospedagem obj) {
			PreparedStatement st = null;
			
			try {
				st = conn.prepareStatement(
						"UPDATE hospedar " 
								+ "SET ocupa_max = (ocupa_max - 1)  "
								+ "WHERE hosp_nome = ? "
								);
				
				st.setString(1, obj.getHosp_nome());
	
	

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
		public Hospedagem faturamento() {
			PreparedStatement st = null;
			ResultSet rs = null;
			try {
				st = conn.prepareStatement(
						"select sum(preco * ocupa_max) as faturamento from hospedar " 
						
						);
				
				
				rs = st.executeQuery();
					if(rs.next()) {
						Hospedagem hospedagem = instantiateHospedagem(rs);
						
						return hospedagem;
						
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

}
