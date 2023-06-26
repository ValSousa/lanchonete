package br.com.fiap.lanchonete.dominio.portas.interfaces;

import java.util.List;

import br.com.fiap.lanchonete.dominio.dtos.CategoriaDto;
import br.com.fiap.lanchonete.dominio.dtos.categorias.CategoriaResponseDto;

public interface CategoriaServicePort {

	public List<CategoriaResponseDto> buscarTodos();

	public CategoriaDto incluir(CategoriaDto categoriaDto);

	public CategoriaDto alterar(CategoriaDto categoriaDto);

	public void excluir(Long id);

	public CategoriaDto buscarPorId(Long id);

}
