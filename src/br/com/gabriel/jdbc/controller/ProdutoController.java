package br.com.gabriel.jdbc.controller;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

import java.sql.Connection;
import java.util.List;

public class ProdutoController {

	private ProdutoDAO produtoDAO;

	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}
	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
		System.out.println("Deletando produto");
	}

	public void salvar(Produto produto) {
		this.produtoDAO.salvarComCategoria(produto);
		System.out.println("Salvando produto");
	}

	public List<Produto> listar() {
		System.out.println("Alterando produto");
		return this.produtoDAO.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome, descricao, id);
		System.out.println("Alterando produto");
	}
}
