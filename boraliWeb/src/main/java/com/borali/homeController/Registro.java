package com.borali.homeController;

public class Registro {
	
	private Integer id;
	private String nome;
	private String email;
	private String senha;
	private String confSenha;

	public Registro(String nome, String email, String senha, String confirmarSenha, Integer id, String confSenha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.confSenha = confSenha;
	}
	
	public String getNome() {
		return nome;
	}
	@Override
	public String toString() {
		return "Registro [nome=" + nome + ", email=" + email + ", senha=" + senha + ", confirmarSenha=" + confSenha
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
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
	public String getConfSenha() {
		return confSenha;
	}
	public void setConfSenha(String confSenha) {
		this.confSenha = confSenha;
	}
}
