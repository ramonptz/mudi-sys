package br.com.alura.mvc.mudi.dto;


import javax.validation.constraints.NotBlank;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
	@NotBlank
	private String nomeproduto;
	
	@NotBlank
	private String urlProduto;
	
	@NotBlank
	private String urlImagen;
	private String descricao;
	
	public String getNomeproduto() {
		return nomeproduto;
	}
	public void setNomeproduto(String nomeproduto) {
		this.nomeproduto = nomeproduto;
	}
	public String getUrlProduto() {
		return urlProduto;
	}
	public void setUrlProduto(String urlProduto) {
		this.urlProduto = urlProduto;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Pedido toPedido() {
		Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeproduto);
		pedido.setUrlImagem(urlImagen);
		pedido.setDescricao(descricao);
		pedido.setUrlProduto(urlProduto);
		return pedido;
	}

}
