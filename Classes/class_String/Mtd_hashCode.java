package class_String;

public class Mtd_hashCode {
    public static void main(String[] args) {
     
        // o hashCode() não possui parâmetros e retorna um valor inteiro que é o
        // código hash da string em questão

        // serve para verificar se os dados se mantiveram constantes ou
		// ocorreram modificacoes (seja por corrupção de arquivos, hacking, etc)

        String texto1 = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
				+ " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
		String texto2 = "Larem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
                + " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
                + " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
                + "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

        // nesse exemplo, o texto2 tem apenas uma letra da primeira palavra diferente de texto1
        // e mesmo assim a diferença do código hash é bem grande
        
        int hash1 = texto1.hashCode();
        int hash2 = texto2.hashCode();

        System.out.println(hash1);
        System.out.println(hash2);
    }
}