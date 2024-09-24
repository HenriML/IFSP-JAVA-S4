package model;

import model.dao.DaoFactory;
import model.dao.OperadorDao;

public class Login {
	
	    private String nome;
	    private String senha;
	    
	    public Login() {
			
		}
	    
	    public Login(String nome, String senha) {
			super();
			this.nome = nome;
			this.senha = senha;
		}
	    
	 
	    
	    public void verificaLogin(String nome, String senha){
	    	 Administrador administrador = new Administrador();
	        if (nome.equals("admin") || senha.equals ("admin")){
	            System.out.println("Logado como adm");
	            
	           
				administrador.crudAdmin();
	            
	        } else {
	        
	        OperadorDao operadorDao = DaoFactory.createOperadorDao();
            Operador operador = new Operador();
            
           	operador.setNome(nome);
           	operador.setSenha(senha);
           	
            operadorDao.logar(operador);
            
            FazerReserva reserva = new FazerReserva();
        	
        	reserva.crudreserva();
	        }
	    }
	    
	    
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getSenha() {
			return senha;
		}
		public void setSenha(String senha) {
			this.senha = senha;
		}
		
		@Override
		public String toString() {
			return "Login [nome=" + nome + ", senha=" + senha + "]";
		}

		

}
