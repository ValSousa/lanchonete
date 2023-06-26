package br.com.fiap.lanchonete.dominio.portas.interfaces;

import java.util.List;

import br.com.fiap.lanchonete.dominio.dtos.CategoriaDto;

public interface CategoriaServicePort {

	List<CategoriaDto> buscarTodos();

	CategoriaDto incluir(CategoriaDto categoriaDto);

	CategoriaDto alterar(CategoriaDto categoriaDto);

	void excluir(Long id);

	CategoriaDto buscarPorId(Long id);

}
