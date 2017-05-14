package main;

import classes.Data;
import classes.Empresa;
import classes.Funcionario;

public class TestaEmpresa {

	public static void main(String[] args) {
		Funcionario f = new Funcionario();
		Empresa e = new Empresa();
		e.cnpj = "332432.4234.32.432.0001";
		e.nome = "IFC";
		
		for(int i=1; i<=100; i++){
			f.nome = "lúcio";
			f.departamento = "Qualquer";
			f.rg = "894457234";
			f.salario = 1000*i;
			f.iniciaExpediente();
			f.recebeAumento(100*i/10);
			f.data = new Data(13, 03, 2017);
			
			e.adicionaFuncionario(f);
			f = new Funcionario();
		}
		
		for(Funcionario f1 : e.funcionarios){
			f1.mostra();
			System.out.println("\n\n");
		}
		e.mostraSalarios();
	}

}
