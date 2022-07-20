package views;

import controllers.CarroController;
import models.Carro;

public  class ListarEntradaCarros {

	public static void renderizar() {
		CarroController carroController = new CarroController();
		System.out.println("\n **** LISTAGEM DE AUTOMOVEIS **** \n");
		for (Carro carro : carroController.listar()) {

            if (carro.getEntrada() == 1)

			System.out.println(carro);

            }
		}
	}
