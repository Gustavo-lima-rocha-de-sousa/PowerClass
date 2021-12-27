package class_String;

import java.util.Scanner;

public class Mtd_concat {
	public static void main(String[] args) {

		// metodo que concatena objetos do tipo String

		System.out.println("Digite o seu nome:");
		String mensagemPadrao = ", como posso te ajudar?";

		Scanner scr = new Scanner(System.in);
		String nome = scr.nextLine();
		scr.close();

		System.out.println("Ola! " + nome.concat(mensagemPadrao));
	}
}