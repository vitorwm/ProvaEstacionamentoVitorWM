package views;
import console.ErroTipo;

public class Principal 
{

	static int Menu()
	{
		int opcao;
		
		System.out.println("\n0- Sair");
		System.out.println("1- Cadastrar automovel");
		System.out.println("2- Entrada do automovel");
		System.out.println("3- Saida do automovel");
		System.out.println("4- Listar carros");
		System.out.println("5- Listar motos");


		opcao = ErroTipo.lerNum("Digite a opcao a ser executada: ");
		return opcao;
	}
	
	public static void main(String[] args) {
		
		int op;

		do{
			op = Menu();

			switch (op){

				case 0: System.out.println("\nPrograma encerrado!\n"); break;
				
				case 1:	CadastrarAutomovel.renderizar(); break;
				
				case 2: EntrarAutomovel.renderizar(); break;
				
				case 3:SairAutomovel sairAutomovel = new SairAutomovel();
				 	   sairAutomovel.renderizar(); break;
				
				case 4: ListarEntradaCarros.renderizar(); break;
				
				case 5: ListarEntradaMotos.renderizar(); break;
				
		
				
				default:
					System.out.println("\nOpção inválida\n");
			}
		} while (op != 0);
				
	}	
}
