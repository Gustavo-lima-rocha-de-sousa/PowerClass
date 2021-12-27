package class_String;

import java.util.Scanner;

public class Mtd_toLowerCase {
    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        String input = scr.nextLine();     
        scr.close();

        System.out.println("Deseja continuar? Responda 'sim' ou 'não'");

        if (input.toLowerCase() == "sim")
        {
            System.out.println("Dando prosseguimento...");
        }
        else if (input.toLowerCase() == "nao" || input.toLowerCase() == "não")
        {
            System.out.println("Encerrando sessão.");
        }
        else 
            System.out.println("Opção inválida");
    }   
}