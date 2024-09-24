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
import model.Reserva;
import model.dao.ReservaDao;

public class ReservaDaoJDBC implements ReservaDao {

		private Connection conn;
	
		public ReservaDaoJDBC(Connection conn) {
		this.conn = conn;
	}
	
	
	
	@Override
	public void insert(Reserva obj) {
PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"insert into reserva  " 
					+ "(nome_cli ,  nome_quarto , data_inicial ,data_final , qnt_dias ) "
					+ "values "
					+ "(?, ?, ?, ?, ?)" ,
					Statement.RETURN_GENERATED_KEYS);
			
			st.setString(1, obj.getNome_cli());
			st.setString(2, obj.getNome_quarto());
			st.setString(3, obj.getData_inicial());
			st.setString(4, obj.getData_final());
			
			st.setInt(5, obj.getQnt_dias());
			
			
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
	public void update(Reserva obj) {
		PreparedStatement st = null;
		
		try {
			st = conn.prepareStatement(
					"UPDATE reserva  " 
					+ "SET nome_cli = ? ,  nome_quarto = ? , data_inicial = ? ,  data_final = ? , qnt_dias = ? "
					+ "where id = ?"
					);
			
			st.setString(1, obj.getNome_cli());
			st.setString(2, obj.getNome_quarto());
			st.setString(3, obj.getData_inicial());
			st.setString(4, obj.getData_final());
			st.setInt(5, obj.getQnt_dias());
			st.setInt(6, obj.getId());
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
	public Reserva findByName(String name) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select * from reserva " 
					+ "where nome_cli = ? "
					);
			
			st.setString(1,name);
			rs = st.executeQuery();
				if(rs.next()) {
					Reserva reserva = instantiateReserva(rs);
					
					return reserva;
					
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
	public List<Reserva> findAll() {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select * from reserva "
					+ "order by nome_cli "
						);
			
			
			rs = st.executeQuery();
			
			List<Reserva> list = new ArrayList<>();
			
			Map<Integer, Reserva> map = new HashMap<>();
			
			while (rs.next()) {
				
				Reserva reserva = map.get(rs.getInt("id"));
				
				if(reserva == null) {
					reserva = instantiateReserva(rs);
					map.put(rs.getInt("id"), reserva);
					
				}
				Reserva op = instantiateReservaV(rs,reserva);
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
	
	
	
	


	private Reserva instantiateReserva(ResultSet rs) throws SQLException {
	Reserva reserva = new Reserva();
	reserva.setNome_cli(rs.getString("nome_cli"));
	reserva.setNome_quarto(rs.getString("nome_quarto"));
	reserva.setData_inicial(rs.getString("data_inicial"));
	reserva.setData_final(rs.getString("data_final"));
	reserva.setQnt_dias(rs.getInt("qnt_dias"));
	
	
	
	return reserva;
}

	private Reserva instantiateReservaV(ResultSet rs, Reserva op) throws SQLException {
	Reserva reserva = new Reserva();
	reserva.setNome_cli(rs.getString("nome_cli"));
	reserva.setNome_quarto(rs.getString("nome_quarto"));
	reserva.setData_inicial(rs.getString("data_inicial"));
	reserva.setData_final(rs.getString("data_final"));
	reserva.setQnt_dias(rs.getInt("qnt_dias"));
	
	
	
	return reserva;
	

}



@Override
public void deleteByName(String name) {

	PreparedStatement st = null;

	try {
		st = conn.prepareStatement(
				"delete from reserva " 
				+ "where nome_cli = ? "
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



@Override
public List<Reserva> relatorio() {
	
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"select  distinct hosp_nome , ocupa_max as total_quartos , qnt_dias as quartos_ocupados , preco , sum(preco * qnt_dias) as faturamento , id "
					+ " from  hospedar, reserva "
					+ " group by hosp_nome "
					);
			
			
			rs = st.executeQuery();
			
			List<Reserva> list = new ArrayList<>();
			
			Map<Integer, Reserva> map = new HashMap<>();
			
			while (rs.next()) {
				
				Reserva reserva = map.get(rs.getInt("id"));
				
				if(reserva == null) {
					reserva = instantiateReserva(rs);
					map.put(rs.getInt("id"), reserva);
					
				}
				Reserva op = instantiateReservaV(rs,reserva);
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
	

	



