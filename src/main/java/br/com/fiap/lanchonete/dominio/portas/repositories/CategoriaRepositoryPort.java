package br.com.fiap.lanchonete.dominio.portas.repositories;

import java.util.List;

import br.com.fiap.lanchonete.dominio.Categoria;

public interface CategoriaRepositoryPort {

	List<Categoria> buscarTodos();

	Categoria incluir(Categoria categoria);

	Categoria alterar(Categoria categoria);

	Categoria buscarPorId(Long id);

	void excluir(Long id);

}
