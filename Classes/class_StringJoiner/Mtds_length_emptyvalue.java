package class_StringJoiner;

import java.util.StringJoiner;

public class Mtds_length_emptyvalue {

	public static void main(String[] args) {

		StringJoiner sj1 = new StringJoiner(",");
		StringJoiner sj2 = new StringJoiner(",");
		
		
		//  O metodo EmptyValue define a string a ser usada ao determinar a representação da string deste StringJoine.
		
		// Ja o metodo length é utilizado para retorna o comprimento da representação String. 
		
		sj1.setEmptyValue("Exemplo");
		System.out.println("A palavra: " + sj1 + " tem o comprimento de: " + sj1.length() + " caracteres.");
		
		
		 sj2.setEmptyValue("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. "
		 		+ "Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. "
		 		+ "Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur."
		 		+ " Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
	        	  
	        System.out.println("A texto tem o comprimento de: " + sj2.length() + " caracteres.");
	}

}
