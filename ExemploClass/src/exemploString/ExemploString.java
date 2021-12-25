package exemploString;

public class ExemploString {

	public static void main(String[] args) {

		String curso = "Java";
		String curso1 = "Jva";

		String nome = "Joao";

		String texto = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
				+ " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
		String texto1 = "Larem ipsom dulor set amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua."
				+ " Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
				+ " Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. "
				+ "Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

		/*
		 * String HashCode serve para verificar se os dados se manteram constantes ou
		 * tiveram modificações. Esse método retorna o código hash das Strings;
		 */

		int tx = texto.hashCode();
		int tx1 = texto1.hashCode();

		System.out.println(tx);
		System.out.println(tx1);

		System.out.println("------HASHCODE-------");
		int aula = curso.hashCode();
		int aula1 = curso1.hashCode();

		System.out.println(aula);
		System.out.println(aula1);

		System.out.println("-----CONCAT------");
		
		/* Concat: Método usado para concatenar Strings */

		String subida = nome.concat(" Subiu no pé de feijão");
		System.out.println(subida);

		String caida = nome.concat(" Caiu do pé de feijão");

		System.out.println(caida);
		
		System.out.println("-----SPLIT------");
		
		/* Split:   */
		
		String valor = "DEVSCHOOL - JAVA - MJV";
        String[] valorComSplit = valor.split("-");

        for(String s : valorComSplit){
               System.out.println(s);
        }
        
        System.out.println("-----SPLIT COM LIMIT------");
         
        /*Slipt Limit:  */
        
        String nomes = "Colaboradores - Daniel - Lais - Arthur - Claudia - Eddward - Gustavo - Jonas - Henrique";
        String[] nomesComSplit = nomes.split("-",3);

        for(String n : nomesComSplit){
               System.out.println(n);
        }
	}
}
