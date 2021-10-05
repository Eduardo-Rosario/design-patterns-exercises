package com.dalila.exercicios.factory.graduacao;

public abstract class Fabrica {

	public abstract Matricula factoryMethod(TipoGraduacao solicitacaoMatricula, Candidato candidato, TipoUnidade unidade) throws Exception;
}
