package br.ucb.dao;

import java.util.List;
import br.ucb.entity.LinhaPesquisa;


public interface LinhaPesquisaDao extends DaoGenerico<LinhaPesquisa, Integer>{

	List<LinhaPesquisa> findByDescricao(String descricao);
	LinhaPesquisa findById(Integer id);

}