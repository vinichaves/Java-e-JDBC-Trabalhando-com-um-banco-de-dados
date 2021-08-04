package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.jdbc.dao.ProdutoDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Produto;

/**
 * Classe para determinar as operações feitas no banco de dados por parte dos produtos
 * @author vinicius.chaves
 *
 */
public class ProdutoController {
	
	private ProdutoDAO produtoDAO;
	
	/** Conexão com o banco de dados */
	public ProdutoController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.produtoDAO = new ProdutoDAO(connection);
	}

	/** Deletar dado do banco de dados */
	public void deletar(Integer id) {
		this.produtoDAO.deletar(id);
	}
	
	/** Salvar dado do banco de dados */
	public void salvar(Produto produto) {
		this.produtoDAO.salvar(produto);
	}

	/** Listar dado do banco de dados */
	public List<Produto> listar() {
		return this.produtoDAO.listar();
	}

	/** Alterar dado do banco de dados */
	public void alterar(String nome, String descricao, Integer id) {
		this.produtoDAO.alterar(nome,descricao, id);
	}
}
