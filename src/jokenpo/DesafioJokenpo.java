package jokenpo;

import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class DesafioJokenpo {

	public static void main(String[] args) {
		// Variáveis
		int optionPlayer;
		int optionComputer;
		String optionPlayerName = null;
		String optionComputerName = null;
		
		//Ler o teclado do usuário
		Scanner scOption = new Scanner(System.in);
		
		//Executando o menu
		menu();
		
		//Lendo opção do Jogador
		optionPlayer = scOption.nextInt();
		
		//Analisando opção do Jogador
		if (optionPlayer < 1 || optionPlayer > 3) {
			System.out.println("Opção inválida por favor selecione as opções listadas acima!!");
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
		
		System.out.println("Você escolheu " + optionPlayerName);
		
		//Gerando a opção do computador
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
		if (optionPlayerName == optionComputerName) {
			System.out.println("O Jogo Empatou!!");
		} 
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
		System.out.println("Qual a sua opção:");
	}

}
