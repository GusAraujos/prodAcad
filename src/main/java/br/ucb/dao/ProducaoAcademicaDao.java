package br.ucb.dao;

import java.util.Date;
import java.util.List;

import br.ucb.VO.AprovacaoProducaoVO;
import br.ucb.entity.ProducaoAcademica;
import br.ucb.entity.Projeto;
import br.ucb.filtro.ProdAcFiltro;

public interface ProducaoAcademicaDao extends DaoGenerico<ProducaoAcademica, Integer> {

	ProducaoAcademica findById(Integer id);
	
	ProducaoAcademica findByProdAc(ProducaoAcademica pa);
	
	public List<Object[]> listSimpleTipo();
	
	public List<Object[]> listSimpleLinha();
	
	public List<Object[]> listSimpleQualis();
	
	public List<Date> listSimpleDatas();
	
	public List<Object[]> listSimpleQualisFiltro(String anoInicio, String anoFim);
	
	public List<Date> listSimpleProdFiltro(String anoInicio, String anoFim);
	
	public List<AprovacaoProducaoVO> listAprovaDiretor();
	
	public List<AprovacaoProducaoVO> listAprovaProfessor(Integer cod);
	
	public void updateResultado(AprovacaoProducaoVO prodAcademica);
	
	public boolean updateResultadoM(AprovacaoProducaoVO prodAcademica);
	
	List<ProducaoAcademica> findByFiltro(ProdAcFiltro filtro);
	
	public List<Object[]> listSimpleQualisFiltroMeu(String anoInicio, String anoFim, Integer cod);

	public List<Object[]> listSimpleQualisMeu(Integer cod);

	public List<Date> listSimpleProdFiltroMeu(String anoInicio, String anoFim, Integer cod);

	public List<Date> listSimplesProdMeu(Integer cod);
	
	public List<AprovacaoProducaoVO> listAprovacaoProducaoVO();

	public AprovacaoProducaoVO findByIdVO(Integer id);

	public boolean aplicaProjeto(Projeto projeto, AprovacaoProducaoVO producao);

	public List<AprovacaoProducaoVO> getProducoesbyProjetoId(Integer idProjeto);

	public boolean desvinculaProjeto(AprovacaoProducaoVO producao);
}
