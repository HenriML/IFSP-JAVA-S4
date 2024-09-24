package model;

import java.io.Serializable;
import java.util.Objects;



public class Hospedagem  implements Serializable {

	private String hosp_nome;
	private String descricao;
	private Integer ocupa_max;
	private Double preco;
	public Hospedagem() {
		
	}
	
	public Hospedagem(String hosp_nome, String descricao, Integer ocupa_max, Double preco) {
		super();
		this.hosp_nome = hosp_nome;
		this.descricao = descricao;
		this.ocupa_max = ocupa_max;
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Hospedagem [hosp_nome=" + hosp_nome + ", descricao=" + descricao + ", ocupa_max=" + ocupa_max
				+ ", preco=" + preco + "]";
	}

	public String getHosp_nome() {
		return hosp_nome;
	}
	public void setHosp_nome(String hosp_nome) {
		this.hosp_nome = hosp_nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Integer getOcupa_max() {
		return ocupa_max;
	}
	public void setOcupa_max(Integer ocupa_max) {
		this.ocupa_max = ocupa_max;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	
	
	
}
