package main;

import classes.Data;
import classes.Funcionario;

public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		
		f1.nome = "lúcio";
		f1.departamento = "Qualquer";
		f1.rg = "894457234";
		f1.salario = 1000;
		f1.iniciaExpediente();
		f1.recebeAumento(100);
		
		f1.data = new Data(13, 03, 2017); 
		f1.mostra();
	}
}