package views;

import controllers.CarroController;
import controllers.MotoController;
import models.Carro;
import models.Moto;
import console.Console;

public class SairAutomovel {
    
    public  void renderizar() {
        String placa;

		
		System.out.println("\n **** SAIR DO ESTACIONAMENTO **** \n");


            System.out.println("\nDigite 1 para RETIRAR um CARRO \nDigite 2 para RETIRAR uma MOTO\n");

            int tipo=Console.readInt();


            if(tipo == 1){

            Carro carro = new Carro();
            CarroController carroController = new CarroController();

            placa = (Console.readString("Digite a placa do CARRO: "));

            carro = carroController.buscarPlaca(placa);


            if(carro != null && carro.getEntrada() == 1 ) 
            {
                double taxa = 5;
                double aleatorio = (Math.random()*60);
                double preco;


                preco = carro.calcularEstadia(taxa, aleatorio);
                

                System.out.println("\nPreco da estadia: " + preco +
                "\nTempo estacionado: " + aleatorio +
                "\nPreco por minuto: " + taxa);

                carro.setEntrada(0);
                carroController.cadastrarCarro(carro);
                
                System.out.println("\nCARRO RETIRADO do estacionamento com sucesso!\n");




            }
            else {System.out.println("\nNão foi possível encontrar um CARRO com a placa digitada DENTRO do estacionamento\n");}

        }


        else if(tipo == 2){

            Moto moto = new Moto();
            MotoController motoController = new MotoController();

            placa = (Console.readString("Digite a placa da Moto: "));

            moto = motoController.buscarPlaca(placa);


            if(moto != null && moto.getEntrada() == 1 ) 
            {
                double taxa = 2;
                double aleatorio = (Math.random()*60);
                double preco;


                preco = moto.calcularEstadia(taxa, aleatorio);
                

                System.out.println("\nPreco da estadia: " + preco +
                "\nTempo estacionado: " + aleatorio +
                "\nPreco por minuto: " + taxa);

                moto.setEntrada(0);
                motoController.cadastrarMoto(moto);
                
                System.out.println("\nMOTO RETIRADA do estacionamento com sucesso!\n");


                

            }
            else {System.out.println("\nNão foi possível encontrar uma MOTO com a placa digitada DENTRO do estacionamento\n");}
        }

    else {
        System.out.println("\nNão foi possível encontrar um VEICULO com a placa digitada\n");
    }

        }





    }
