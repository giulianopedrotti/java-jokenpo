package jokenpo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DesafioJokenpo {

	public static void main(String[] args) {
		// Vari�veis
		int optionPlayer;
		int optionComputer;
		String optionPlayerName = null;
		String optionComputerName = null;
		String novaPartida = "S";
		
		while (novaPartida.equalsIgnoreCase("S")) {
			//Ler o teclado do usu�rio
			Scanner scOption = new Scanner(System.in);
			
			//Executando o menu
			menu();
			
			//Lendo op��o do Jogador
			optionPlayer = scOption.nextInt();
			
			//Analisando op��o do Jogador
			if (optionPlayer < 1 || optionPlayer > 3) {
				System.out.println("Op��o inv�lida por favor selecione as op��es listadas acima!!");
				main(null);
			} else {
				System.out.println("");
				switch(optionPlayer) {
				case 1:
					optionPlayerName = "Pedra";
					break;
				case 2:
					optionPlayerName = "Papel";
					break;
				case 3:
					optionPlayerName = "Tesoura";
					break;
				}
			}
			
			System.out.println("Voc� escolheu " + optionPlayerName);
			
			//Gerando a op��o do computador
			Random rnComputer = new Random();
			optionComputer = rnComputer.nextInt(3) + 1;
			switch(optionComputer) {
			case 1:
				optionComputerName = "Pedra";
				break;
			case 2:
				optionComputerName = "Papel";
				break;
			case 3:
				optionComputerName = "Tesoura";
				break;
			}
			System.out.println("Computador escolheu  " + optionComputerName);
			
			//Computando ganhador
			if (optionPlayer == 1 && optionComputer ==1) {
				System.out.println("O Jogo Empatou!!");
			} else if ( optionPlayer == 1 && optionComputer == 2 ) {
				System.out.println("O Computador Ganhou!!");
			} else if ( optionPlayer == 1 && optionComputer == 3 ) {
				System.out.println("Voc� Ganhou!!");
			} else if ( optionPlayer == 2 && optionComputer == 1 ) {
				System.out.println("Voc� Ganhou!!");
			} else if ( optionPlayer == 2 && optionComputer == 2 ) {
				System.out.println("O Jogo Empatou!!");
			} else if ( optionPlayer == 2 && optionComputer == 3 ) {
				System.out.println("O Computador Ganhou!!");
			} else if ( optionPlayer == 3 && optionComputer == 1 ) {
				System.out.println("O Computador Ganhou!!");
			} else if ( optionPlayer == 3 && optionComputer == 2 ) {
				System.out.println("Voc� Ganhou!!");
			} else {
				System.out.println("O Jogo Empatou!!");
			}
			
			//Nova partida
			System.out.print("");
			System.out.println("Jogar novamente (S/N)?");
			novaPartida = scOption.next();
		}
		
		System.out.println("F I M");
		

	}
	
	public static void menu() {
		//Menu
		System.out.println("----------------------------");
		System.out.println("      J O K E N P O");
		System.out.println("----------------------------");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println("----------------------------");
		System.out.println("");
		System.out.println("Qual a sua op��o:");
	}
}
