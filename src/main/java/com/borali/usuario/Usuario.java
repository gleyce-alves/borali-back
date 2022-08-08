package com.borali.usuario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.lang.Nullable;

@Entity
public class Usuario {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private Long id; 
	
	@Nullable
	private String nome;
	
	@Nullable
	private int rg;
	
	@Nullable
	private int cpf;
	
	@Nullable
	private String endereco;
	
	@Nullable
	private int telefone;
	
	@Nullable
	private String email;
	
	@Nullable
	private String senha;
	
	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", rg=" + rg + ", cpf=" + cpf + ", endereco=" + endereco
				+ ", telefone=" + telefone + ", email=" + email + ", senha=" + senha + "]";
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
	public int getRg() {
		return rg;
	}
	public void setRg(int rg) {
		this.rg = rg;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	
	
}
