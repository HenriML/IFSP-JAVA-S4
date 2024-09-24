package model.dao;

import db.DB;
import model.dao.impl.HospedagemDaoJDBC;
import model.dao.impl.OperadorDaoJDBC;
import model.dao.impl.ReservaDaoJDBC;

public class DaoFactory {

	public static OperadorDao createOperadorDao() {
		
	return new OperadorDaoJDBC(DB.getConnection());
	}
	
	public static ReservaDao createReservaDao() {
		
		return new ReservaDaoJDBC(DB.getConnection());
		}
	
	
		public static HospedagemDao createHospedagemDao() {
		
		return new HospedagemDaoJDBC(DB.getConnection());
		}
}
