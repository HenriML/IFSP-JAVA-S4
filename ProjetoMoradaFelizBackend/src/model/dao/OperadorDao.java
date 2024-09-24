package model.dao;

import java.util.List;

import model.Operador;

public interface OperadorDao {
	
	
	void insert(Operador obj);
	void update(Operador obj);
	void deleteById(Integer id);
	Operador findById(Integer id);
	Operador logar(Operador obj);
	
	List<Operador> findAll();
	
	
	


}
