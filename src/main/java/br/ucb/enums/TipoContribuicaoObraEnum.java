package br.ucb.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoContribuicaoObraEnum {

	CAPITULO      (1, "Capítulo"), 
	VERBETE       (2 ,"Verbete"), 
	APRESENTACAO  (3, "Apresentação"), 
	INTRODUCAO    (4, "Introdução"), 
	PREFACIO      (5, "Prefácio"),
	POSFACIL      (6, "Posfácio"), 
	OBRA_COMPLETA (7, "Obra Completa");
	
	private Integer codigo;
	private String descricao;

	TipoContribuicaoObraEnum(Integer codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
	}
	
	public static List<TipoContribuicaoObraEnum> list(){
		return new ArrayList<>(Arrays.asList(TipoContribuicaoObraEnum.values()));
	}

	public Integer getCodigo() {
		return this.codigo;
	}

	public String getDescricao() {
		return this.descricao;
	}
}
