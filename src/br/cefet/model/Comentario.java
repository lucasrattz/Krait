package br.cefet.model;

import java.sql.Date;

public class Comentario {

	private int id;
	private String descricao;
	private Post post;
	private Usuario usuario;
	private Date datPost;
	
	
	public Comentario() {
		super();
	}
	public Comentario(int id, String descricao, Post post, Usuario usuario, Date datPost) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.post = post;
		this.usuario = usuario;
		this.datPost = datPost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Post getPost() {
		return post;
	}
	public void setPost(Post post) {
		this.post = post;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Date getDatPost() {
		return datPost;
	}
	public void setDatPost(Date datPost) {
		this.datPost = datPost;
	}
	
	
	
}
