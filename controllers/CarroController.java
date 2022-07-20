package controllers;

import java.util.ArrayList;

import models.Carro;

public class CarroController {
    
    private static ArrayList<Carro> carros = new ArrayList<Carro>();

    public ArrayList<Carro> listar(){
		return carros;
	}

    public  boolean cadastrarCarro(Carro carro){
		if( (buscarPlaca(carro.getPlaca()) == null ))   {
			carros.add(carro);
			return true;
		}
		return false;
	}


	public  Carro buscarPlaca(String placa) {
		for(Carro CarroCad : carros) {
			if(CarroCad.getPlaca().equals(placa)) {
				return CarroCad;
			}
		}
		return null;
	}
}
