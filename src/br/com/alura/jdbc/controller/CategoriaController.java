package br.com.alura.jdbc.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jdbc.dao.CategoriaDAO;
import br.com.alura.jdbc.factory.ConnectionFactory;
import br.com.alura.jdbc.modelo.Categoria;

/**
 *  * Classe para determinar as operações feitas no banco de dados por parte das categoriass
 * @author vinicius.chaves
 *
 */

public class CategoriaController {
	
	private CategoriaDAO categoriaDAO;

	/** Gerando uma conexao com o bando de dados */
	public CategoriaController() {
		Connection connection = new ConnectionFactory().recuperarConexao();
		this.categoriaDAO = new CategoriaDAO(connection);
	}
	
	/** Gerar lista do banco de dados */
	public List<Categoria> listar() {
		return this.categoriaDAO.listar();
	}
}
