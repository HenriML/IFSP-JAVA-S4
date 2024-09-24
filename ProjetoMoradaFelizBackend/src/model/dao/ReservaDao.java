package model.dao;

import java.util.List;

import model.Reserva;

public interface ReservaDao {


	void insert(Reserva obj);
	void update(Reserva obj);
	
	void deleteByName(String name);
	
	Reserva findByName(String name);
	
	List<Reserva> findAll();
	
	List<Reserva> relatorio();
	

	
}
