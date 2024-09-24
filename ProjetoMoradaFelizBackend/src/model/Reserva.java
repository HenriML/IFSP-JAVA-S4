package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Objects;

public class Reserva  implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome_cli ;
    private String  nome_quarto;
    private String   data_inicial;
    private String    data_final;
    private Integer qnt_dias;
    
    public Reserva() {
    	
    }

	public Reserva(Integer id, String nome_cli, String nome_quarto,String data_inicial, String data_final, Integer qnt_dias ) {
		super();
		this.id = id;
		this.nome_cli = nome_cli;
		this.nome_quarto = nome_quarto;
		this.data_inicial = data_inicial;
		this.data_final = data_final;
		this.qnt_dias = qnt_dias;
	}

	@Override
	public String toString() {
		return "Reserva [Nome_cli=" + nome_cli + ", Nome_quarto=" + nome_quarto + ", Data_inicial=" + data_inicial
				+ ", Data_final=" + data_final + ", Qnt_dias=" + qnt_dias + "]";
	}

	public String getNome_cli() {
		return nome_cli;
	}

	public void setNome_cli(String nome_cli) {
		this.nome_cli = nome_cli;
	}

	public String getNome_quarto() {
		return nome_quarto;
	}

	public void setNome_quarto(String nome_quarto) {
		this.nome_quarto = nome_quarto;
	}

	public String getData_inicial() {
		return data_inicial;
	}



	public String getData_final() {
		return data_final;
	}

	public void setData_final(String data_final) {
		this.data_final = data_final;
	}

	public Integer getQnt_dias() {
		return qnt_dias;
	}

	public void setQnt_dias(Integer qnt_dias) {
		this.qnt_dias = qnt_dias;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome_cli);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reserva other = (Reserva) obj;
		return Objects.equals(nome_cli, other.nome_cli);
	}

	public void setData_inicial(String string) {
		// TODO Auto-generated method stub
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	

	

	

	
    

}
