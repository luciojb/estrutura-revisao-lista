package classes;

import java.util.Date;

public class Funcionario {
	public String nome, departamento, dataEntrada, rg;
	public double salario;
	public Data data;
	
	public Funcionario(){
		this.data = new Data();
	}
	
	public void recebeAumento(double valor){
		this.salario += valor;
	}
	
	public double calculaGanhoAnual(){
		return this.salario*12;
	}
	
	public void iniciaExpediente(){
		this.dataEntrada = "14/03/2017";
	}
	
	public void encerraExpediente(){
		//lógica quando encerra expediente
	}

	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Funcionario [nome=");
		builder.append(nome);
		builder.append(", departamento=");
		builder.append(departamento);
		builder.append(", dataEntrada=");
		builder.append(dataEntrada);
		builder.append(", rg=");
		builder.append(rg);
		builder.append(", salario=");
		builder.append(salario);
		builder.append(", data=");
		builder.append(data.toString());
		builder.append(", calculaGanhoAnual()=");
		builder.append(calculaGanhoAnual());
		builder.append("]");
		return builder.toString();
	}

	public void mostra(){
		System.out.println(this.toString());
	}
}
