package classes;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
	public String nome, cnpj;
	public List<Funcionario> funcionarios;
	
	public Empresa(){
		this.funcionarios = new ArrayList<>();
	}
	
	public void adicionaFuncionario(Funcionario f){
		this.funcionarios.add(f);
	}
	
	public void mostraSalarios(){
		StringBuilder builder = new StringBuilder();
		builder.append("Salarios: \n");
		for(Funcionario f : this.funcionarios){
			builder.append("Funcionario [nome=");
			builder.append(f.nome);
			builder.append(", salario=");
			builder.append(f.salario);
			builder.append(", calculaGanhoAnual()=");
			builder.append(f.calculaGanhoAnual());
			builder.append("]");
			builder.append("\n\n");
		}
		System.out.println(builder.toString());
	}
}
