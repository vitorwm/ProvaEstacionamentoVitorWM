package models;

public  class Automovel {

	private String modelo;

	private String placa;

	private String cor;

	private int entrada;

	
	public  double calcularEstadia(double taxa, double aleatorio){
		return (Math.random());
}


	


	public int getEntrada() {
		return entrada;
	}





	public void setEntrada(int entrada) {
		this.entrada = entrada;
	}





	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

@Override
	public String toString() {
		return "Placa: "+getPlaca()+ "| Modelo "+getModelo()+ "| Cor: "+ getCor();
	}
	
}