package controllers;

import java.util.ArrayList;

import models.Moto;

public class MotoController {

    private static ArrayList<Moto> motos = new ArrayList<Moto>();

    public ArrayList<Moto> listar(){
		return motos;
	}

    public  boolean cadastrarMoto(Moto moto){
		if( (buscarPlaca(moto.getPlaca()) == null ))   {
			motos.add(moto);
			return true;
		}
		return false;
	}


	public  Moto buscarPlaca(String placa) {
		for(Moto MotoCad : motos) {
			if(MotoCad.getPlaca().equals(placa)) {
				return MotoCad;
			}
		}
		return null;
	}
}