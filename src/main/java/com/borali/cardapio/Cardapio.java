package com.borali.cardapio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cardapio {
		
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	private String nome;
	private String desc;
	private Double preco;
	private Long ref;
	
	@Override
	public String toString() {
		return "Cardapio [id=" + id + ", nome=" + nome + ", desc=" + desc + ", preco=" + preco + ", ref=" + ref + "]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Long getRef() {
		return ref;
	}
	public void setRef(Long ref) {
		this.ref = ref;
	}
	
}
