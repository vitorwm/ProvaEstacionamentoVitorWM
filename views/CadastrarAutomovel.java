package views;

import controllers.CarroController;
import controllers.MotoController;
import models.Carro;
import models.Moto;
import console.Console;

public class CadastrarAutomovel {
    
    public static void renderizar() {
		
		System.out.println("\n **** CADASTRO DE AUTOMOVEL **** \n");


            System.out.println("\nDigite 1 para cadastrar um CARRO \nDigite 2 para cadastrar uma MOTO  \n");

            int tipo=Console.readInt();


            if(tipo == 1){

            Carro carro = new Carro();
            CarroController carroController = new CarroController();


            carro.setPlaca(Console.readString("Digite a placa do CARRO: "));



                if(carroController.cadastrarCarro(carro)) 
                {
                    carro.setModelo(Console.readString("Modelo: "));
                    carro.setCor(Console.readString("Cor: "));
                    System.out.println("\nCarro cadastrado com sucesso");

                }
                else{
                    System.out.println("\nOpcao Invalida, retornando para o menu principal...");
                }
            }

            else if (tipo == 2){

            Moto moto = new Moto();
            MotoController motoController = new MotoController();

            moto.setPlaca(Console.readString("Digite a placa da MOTO: "));

            
                if(motoController.cadastrarMoto(moto )) 
                    {

                        moto.setModelo(Console.readString("Modelo: "));
                        moto.setCor(Console.readString("Cor: "));
                        System.out.println("\nMoto cadastrado com sucesso");

                    }
            }

                else{
                    System.out.println("\nOpcao Invalida, retornando para o menu principal...");
                }


		

        
    }
}
