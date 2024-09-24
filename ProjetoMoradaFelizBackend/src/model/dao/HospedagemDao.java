package model.dao;

import java.util.List;

import model.Hospedagem;

public interface HospedagemDao {
	
	void insert(Hospedagem obj);
	void update(Hospedagem obj);
	void confirma(Hospedagem obj);
	void deleteByName(String name);
	Hospedagem findByName(String name);
	Hospedagem faturamento();
	List<Hospedagem> findAll();

}
