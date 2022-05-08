package br.cefet.model;

import java.sql.Date;
import java.util.Calendar;

public class Post {
	
	private int id;
	private String titulo;
	private String conteudo;
	private Date datPost;
	private Usuario usuario;

	
	public Post() {
		super();
	}
	
	public Post(int id, String titulo, String conteudo, Date datPost, Usuario usuario) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.datPost = datPost;
		this.usuario = usuario;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}
	public Date getDatPost() {
		return datPost;
	}
	public void setDatPost(Date datPost) {
		this.datPost = datPost;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	
	
	
	
}



