package class_String;

import java.util.Scanner;

public class Mtd_equalsIgnoreCase {
	public static void main(String[] args) {

		//Equals Ignore Case tem a funcionalidade de verificar se duas String sao iguais
		//ignorando se tem caracteres maiusculos ou minusculos
		
		//A comparacao de String's so e possivel com os metodos equalsIgnoreCase ou equals.
		
		System.out.println("Deseja continuar? Responda 'sim' ou 'nao'");

		Scanner scr = new Scanner(System.in);
		String input = scr.nextLine();
		scr.close();

		if (input.equalsIgnoreCase("sim")) {
			System.out.println("Dando prosseguimento...");
		} else if (input.equalsIgnoreCase("nao")) {
			System.out.println("Encerrando sessao.");
		} else {
			System.out.println("Opcao invalida");
		}
	}
}