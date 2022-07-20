package views;

import controllers.CarroController;
import controllers.MotoController;
import models.Carro;
import models.Moto;
import console.Console;


public class EntrarAutomovel {
    
    public static void renderizar() {
        String placa;

		
		System.out.println("\n **** ENTRADA DE AUTOMOVEL **** \n");
       
            System.out.println("\nDigite 1 para ENTRAR no estacionamento com um CARRO \n Digite 2 para ENTRAR no estacionamento com uma MOTO  \n");

            int tipo=Console.readInt();


            if(tipo == 1){

            Carro carro = new Carro();
            CarroController carroController = new CarroController();



            placa = (Console.readString("Digite a placa do CARRO: "));

            carro = carroController.buscarPlaca(placa);


            if(carro != null && carro.getEntrada()==0) 
            {

				carro.setEntrada(1);
                carroController.cadastrarCarro(carro);
                
                System.out.println("\nCARRO deu entrada no estacionamento com sucesso!\n");
                
                

        	}else {
                System.out.println("\nNão foi possível encontrar um CARRO com a placa digitada\n");
            }
        }

            if(tipo == 2){

                Moto moto = new Moto();
                MotoController motoController = new MotoController();
    
    
    
                placa = (Console.readString("Digite a placa da MOTO: "));
    
                moto = motoController.buscarPlaca(placa);
    
    
                if(moto != null && moto.getEntrada()==0) 
                {
    
                    moto.setEntrada(1);
                    motoController.cadastrarMoto(moto);
                    
                    System.out.println("\nMOTO deu entrada no estacionamento com sucesso!\n");
                    
                    
    
                }else {
                    System.out.println("\nNão foi possível encontrar uma MOTO com a placa digitada\n");
                }
                
    

		

        }
    }
}


