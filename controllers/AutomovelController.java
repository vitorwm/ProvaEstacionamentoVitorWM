package controllers;

import java.util.ArrayList;
import models.Automovel;

public class AutomovelController {
    
    private static ArrayList<Automovel> automoveis = new ArrayList<Automovel>();


	public ArrayList<Automovel> listar(){
		return automoveis;
	}

    public  boolean cadastrarAuto(Automovel automovel){
		if( (buscarPlaca(automovel.getPlaca()) == null ))   {
			automoveis.add(automovel);
			return true;
		}
		return false;
	}


	public  Automovel buscarPlaca(String placa) {
		for(Automovel automovelCad : automoveis) {
			if(automovelCad.getPlaca().equals(placa)) {
				return automovelCad;
			}
		}
		return null;
	}

}
