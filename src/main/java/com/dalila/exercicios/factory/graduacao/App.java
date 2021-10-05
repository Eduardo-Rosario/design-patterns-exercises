package com.dalila.exercicios.factory.graduacao;

public class App {

	public static void main(String[] args) {
		Fabrica fabrica = new FabricaMatricula();
		
		TipoGraduacao presencial = TipoGraduacao.GRADUACAO;
		TipoGraduacao ead = TipoGraduacao.GRADUACAO;
		TipoGraduacao pos = TipoGraduacao.POS_GRADUACAO;
		
		TipoUnidade unidade = TipoUnidade.UNIDADE;
		TipoUnidade polo = TipoUnidade.POLO;
		
		try{
			Matricula matriculaPresencial = fabrica.factoryMethod(presencial, new Candidato("aaaaa", Requisito.ENSINO_MEDIO), unidade);
			Matricula matriculaEAD = fabrica.factoryMethod(ead, new Candidato("oooo", Requisito.ENSINO_MEDIO), polo);
			Matricula matriculaPos = fabrica.factoryMethod(pos, new Candidato("iiii", Requisito.GRADUACAO), unidade);
			
			System.out.println(matriculaPresencial.getTipoMatricula());
			System.out.println(matriculaEAD.getTipoMatricula());
			System.out.println(matriculaPos.getTipoMatricula());
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}

}
