package model;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.HospedagemDao;
import model.dao.OperadorDao;
import model.dao.ReservaDao;
public class Administrador {
	
	     

	       public void crudAdmin() {
    			Integer id;
		    	String nome;
	            String email;
	            String senha;
	            String cpf;
	            String rg;
	            Double salario;
	            
	            String hosp_nome;
	            String descricao;
	            int ocupa_max;
	            Double preco;
	           
	   		    String  nome_cli ;
	   	        String  nome_quarto;
	   	        String  data_inicial;
	   	        String  data_final;
	   	        Integer qnt_dias;
	            
	            
	       
    	 	System.out.println("Escolha uma opção");
            System.out.println("1 - Cadastrar Operador");
            System.out.println("2 - Cadastrar Hospedagem");
            System.out.println("3 - Editar Hospedagem");
            System.out.println("4 - Excluir Hospedagem");
            System.out.println("5 - Procura Hospedagem");
            System.out.println("6 - Relatório");
            System.out.println("7 - Criar Reserva");
            System.out.println("8 - Excluir Reserva");
            System.out.println("9 - Confirma Reserva");
            
            
            Scanner sc = new Scanner(System.in);
            String opcao = sc.nextLine();
            
            
            
            OperadorDao operadorDao = DaoFactory.createOperadorDao();
            Operador operador = new Operador();
            
            Reserva reserva = new Reserva();
            ReservaDao reservaDao = DaoFactory.createReservaDao();
              
            
            HospedagemDao hospedagemDao = DaoFactory.createHospedagemDao();
            Hospedagem hospedagem = new Hospedagem();
            
            
            
           
            switch (opcao) {
            
            case "1":
            	System.out.println("nome");
            	 nome = sc.nextLine();
            	 System.out.println("email");
            	 email = sc.nextLine();
            	 System.out.println("senha");
            	 senha = sc.nextLine();
            	 System.out.println("cpf");
            	 cpf = sc.nextLine();
            	 System.out.println("rg");
            	 rg = sc.nextLine();
            	 System.out.println("salario");
            	 salario = sc.nextDouble();
            	 
            	Operador newOperador = new Operador(null,nome,email,senha,cpf,rg,salario);
        		operadorDao.insert(newOperador);
        		
        		System.out.println("Inserted! New id = " + newOperador.getId());
        		
        		break;
        		
            case "2":
            	
             System.out.println("Nome hospedagem");
           	 hosp_nome = sc.nextLine();
           	 System.out.println("Descricao");
           	 descricao = sc.nextLine();
           	 System.out.println("Ocupação maxima");
           	 ocupa_max = sc.nextInt();
           	 sc.nextLine();
           	 System.out.println("preço");
           	 preco = sc.nextDouble();
           	 
           	Hospedagem newHospedagem = new Hospedagem(hosp_nome,descricao,ocupa_max,preco);
       		hospedagemDao.insert(newHospedagem);
       		
       		System.out.println("Create! ");
       		
        		break;
        		
            case "3":
            	
            	System.out.println("nome da hospedagem que deseja alterar");
            	sc.nextLine();
            	hosp_nome = sc.nextLine();
            	hospedagem = hospedagemDao.findByName(hosp_nome);
            	
            		
            	System.out.println(hospedagem);
            	
            	System.out.println("campo que deseja modificar");
            	String campo = sc.nextLine();
            	
            	if(campo.equals("nome")) {
            		
            		hosp_nome = sc.nextLine();
            		hospedagem.setHosp_nome(hosp_nome);
	        		hospedagemDao.update(hospedagem);
	        		
            	} else if (campo.equals("descricao")) {
            		
            		descricao = sc.nextLine();
            		hospedagem.setDescricao(descricao);
	        		hospedagemDao.update(hospedagem);
	        		
            	} else if (campo.equals("max")) {
            		
            		ocupa_max = sc.nextInt();
            		hospedagem.setOcupa_max(ocupa_max);
	        		hospedagemDao.update(hospedagem);
	        		
            	} else if (campo.equals("preco")) {
            		
            		preco = sc.nextDouble();
            		hospedagem.setPreco(preco);
	        		hospedagemDao.update(hospedagem);
	        		
            	} 
            	
        		System.out.println("Update Completed!");
            	
        		break;
        		
            case "4":

        		System.out.println("Digite o nome da hospedagem que deseja excluir");
        		sc.nextLine();
        		hosp_nome = sc.nextLine();
            	hospedagemDao.deleteByName(hosp_nome);
        		
            	System.out.println("Delet Completed!");
            	break;
            	
            case "5": 
            	System.out.println("buscar nome da hospedagem");
            	hosp_nome = sc.nextLine();
            	
            	hospedagem = hospedagemDao.findByName(hosp_nome);
            	
            		
            	System.out.println(hospedagem);
            	break;
            	
            case "6":
            	
            	List<Hospedagem> lista = hospedagemDao.findAll();
        		for (Hospedagem allhosp : lista) {
        			System.out.println(allhosp);
        		}
        		
        		
            	List<Reserva> list = reservaDao.findAll();
        		for (Reserva obj : list) {
        			System.out.println(obj);
        		}
        		
        		//Hospedagem faturamento = hospedagemDao.faturamento();
        		//System.out.println(faturamento);
        		break;
        		
        		
        	
        		
            case "7":
            	System.out.println("Nome cliente");
           	 nome_cli = sc.nextLine();
           	 System.out.println("Qual quarto");
           	 nome_quarto = sc.nextLine();
           	 System.out.println("Data de hoje");
           	 data_inicial = sc.nextLine();
           	 System.out.println("Data final");
           	 data_final = sc.nextLine();
           	 System.out.println("quantidade de dias");
           	 qnt_dias = sc.nextInt();
           	 
           	
           	 
           	 reserva = new Reserva(null,nome_cli , nome_quarto, data_inicial , data_final, qnt_dias );
             	
      		reservaDao.insert(reserva);
      		
      		System.out.println("Inserted!");
       		
       		break;
            case "8": 

        		System.out.println("Digite o nome que desejar deletar");
        		sc.nextLine();
        		nome_cli = sc.nextLine();
            	reservaDao.deleteByName(nome_cli);
        		
            	
            	System.out.println("Delet Completed!");
            	break;
       		
            	
            	case "9":
            		
            		System.out.println("confirmar presença?");
                	sc.nextLine();
                	String confirma = sc.nextLine();
                	
                	if(confirma.equals("sim")) {
                		System.out.println("Qual quarto?");
                		hosp_nome = sc.nextLine();
                		hospedagem.setHosp_nome(hosp_nome);
    	        		hospedagemDao.confirma(hospedagem);
    	        		
                	} else if (confirma.equals("nao")) {
                		
                		System.out.println("obrigado!");
                	}
            		System.out.println("Confirmado!");
            	
            	break;
            
            }
            
          
            
            sc.close();
            
    	}
}
	 
	    
	

