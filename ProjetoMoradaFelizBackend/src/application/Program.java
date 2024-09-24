package application;

import java.util.Scanner;

import model.Login;


public class Program {

	
	
	public static void main(String[]  args) {
		
		  

		Scanner sc = new Scanner(System.in);

		Login login = new Login();
		System.out.println("Login");
		String nome = sc.nextLine();
		System.out.println("Senha");
		String senha = sc.nextLine();
		login.verificaLogin(nome, senha);
		
		sc.close();
		
	}
	
	
}
