package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

public class RequisicaoNovoPedido {
	
<<<<<<< aula3
	private String nomeproduto;
	private String urlProduto;
	private String urlImagen;
	private String descricao;
<<<<<<< HEAD
=======
	
	
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
		br.com.alura.mvc.mudi.model.Pedido pedido = new Pedido();
		pedido.setNomeProduto(nomeproduto);
		pedido.setUrlImagem(urlImagen);
		pedido.setDescricao(descricao);
		pedido.setUrlProduto(urlProduto);
		return pedido;
	}
>>>>>>> branch 'aula3' of https://github.com/ramonptz/mudi-sys.git

=======
	private nomeproduto
	urlProduto
	urlImagen
	descricao
//
>>>>>>> fb63e66 versão do pc-marinha desatualizado
}
