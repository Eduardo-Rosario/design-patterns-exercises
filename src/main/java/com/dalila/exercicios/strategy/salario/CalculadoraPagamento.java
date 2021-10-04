package com.dalila.exercicios.strategy.salario;
import com.dalila.exercicios.strategy.salario.Departamento;
import com.dalila.exercicios.strategy.salario.Funcionario;

public class CalculadoraPagamento{

    public static double calcular(Funcionario funcionario, 
    		Departamento departamento){
        return departamento.calcularSalario(funcionario);
    }
}