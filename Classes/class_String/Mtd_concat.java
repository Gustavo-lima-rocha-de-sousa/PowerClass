package class_String;

import java.util.Scanner;

public class Mtd_concat {
    public static void main(String[] args) {

        // método que concatena objetos do tipo String
    
        String mensagemPadrao = ", como posso te ajudar?";

        Scanner scr = new Scanner(System.in);
        String nome = scr.nextLine();
        scr.close();

        System.out.println("Olá " + nome + mensagemPadrao);
    }
}