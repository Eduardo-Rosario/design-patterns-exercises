package com.dalila.exercicios.factory.graduacao;

import com.dalila.exercicios.factory.graduacao.Fabrica;

public class FabricaMatricula extends Fabrica {

	@Override
	public Matricula factoryMethod(TipoGraduacao solicitacao, 
			Candidato candidato, TipoUnidade unidade) throws Exception{
		Matricula novaMatricula = null;
		if(solicitacao.equals(TipoGraduacao.POS_GRADUACAO) && isSolicitacaoValida(solicitacao, candidato)) {
			novaMatricula = new MatriculaPosGraduacao();
		} else if(solicitacao.equals(TipoGraduacao.GRADUACAO) && unidade.equals(TipoUnidade.UNIDADE)) {
			novaMatricula = new MatriculaPresencial();
		} else if(solicitacao.equals(TipoGraduacao.GRADUACAO) && unidade.equals(TipoUnidade.POLO)) {
			novaMatricula = new MatriculaEAD();
		} else {
			throw new Exception("Solicitação de matrícula inválida");
		}
		return novaMatricula;
	}

	private boolean isSolicitacaoValida(TipoGraduacao solicitacao, Candidato candidato) {
		return candidato.getGrauEscolaridade().equals(Requisito.GRADUACAO);
	}

}
