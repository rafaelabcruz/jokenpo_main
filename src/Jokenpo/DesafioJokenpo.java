package Jokenpo;

import java.util.Random;
import java.util.Scanner;

public class DesafioJokenpo {

		public static void main(String[] args) {
			
			//1-papel 2-pedra 3-tesoura
			//U(1) C(2) = -1, usuario vence
			//U(1) C(3) = -2, computador vence
			//U(2) C(1) = 1, computador vence
			//u(2) C(3) = -1, usuario vence
			//U(3) C(1) =  2, usuario vence
			//U(3) C(2) =  1, computador vence
			Scanner leitor = new Scanner(System.in);
			Random gerador = new Random();
			
			int numeroUsuario = 0;
			int escolhaComputador;
			int pontosUsuario =0;
			int pontosComputador =0;
			
			System.out.println("_________JoKenPo_________");
			System.out.println("1. Papel");
			System.out.println("2. Pedra");
			System.out.println("3. Tesoura");
			System.out.print("Digite a opção desejada: ");
			
			numeroUsuario = leitor.nextInt();
			escolhaComputador = gerador.nextInt(3) + 1;
								
			switch(numeroUsuario) {
				case 1:
					System.out.println("Usuario escolheu PAPEL!");
					break;
				case 2:
					System.out.println("Usuario escolheu PEDRA!");
					break;
				case 3:
					System.out.println("Usuario escolheu TESOURA!");
					break;
				default:
					System.out.println("Opção invalida!");
					break;
			}
			switch(escolhaComputador) {
				case 1:
					System.out.println("Computador escolheu PAPEL!");
					break;
				case 2:
					System.out.println("Computador escolheu PEDRA!");
					break;
				case 3:
					System.out.println("Computador escolheu TESOURA!");
					break;
			}
				
				// Verificação do resultado
				if (numeroUsuario >3) {
					System.out.println("Jogo Reiniciado");
					pontosUsuario = 0;
					pontosComputador = 0;
				}
				if (numeroUsuario == escolhaComputador) {
					System.out.println("Empate");
				}
				else if ((numeroUsuario - escolhaComputador) == -1 || 
						 (numeroUsuario - escolhaComputador) == 2) {
					System.out.println("Usuario Vencedor");
					pontosUsuario++;
				}
				else if ((numeroUsuario - escolhaComputador) == 1 || 
						 (numeroUsuario - escolhaComputador) == -2) {
					System.out.println("Computador Vencedor");
					pontosComputador++;
				}
				
			
	}
}
