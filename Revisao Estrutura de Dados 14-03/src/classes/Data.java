package classes;

public class Data {
	public int dia, mes, ano;
	
	public Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(){
		
	}

	@Override
	public String toString() {
		return dia+"/"+mes+"/"+ano;
	}
	
	
}
