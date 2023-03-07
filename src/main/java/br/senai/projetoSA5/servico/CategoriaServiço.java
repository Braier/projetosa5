package br.senai.projetoSA5.servico;

import java.util.List;

import br.senai.projetoSA5.orm.Categoria;

public interface CategoriaServiço {
	public List<Categoria> listarCatergorias();

	public void apagarCategoria(Integer id);

	public Categoria salvarCategoria(Categoria categoria);

	public Categoria consultaCategoriaId(Integer id);

	public Categoria atualizarCategoria(Categoria categoria);
}
