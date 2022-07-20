package views;

import controllers.MotoController;
import models.Moto;

public  class ListarEntradaMotos {

	public static void renderizar() {
		MotoController motoController = new MotoController();
		System.out.println("\n **** LISTAGEM DE MOTOS QUE ESTAO NO ESTACIONAEMNTO **** \n");
		for (Moto moto : motoController.listar()) {

            if (moto.getEntrada() == 1)

			System.out.println(moto);

            }
		}
	}
