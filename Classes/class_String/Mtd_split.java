package class_String;

public class Mtd_split {
    public static void main(String[] args) {    
   
        // o método split() divide uma determinada string em várias partes com base num padrão do tipo String
        // que é dado como parâmetro, retornando um vetor de strings
        
        String compras = "macarrão cereija gelatina arroz champignon abacaxi";

        String[] lista = compras.split(" ");

        for(String alimento : lista)
            System.out.println(alimento);

        // esse método é sobrecarregado, podendo receber um segundo parâmetro do tipo int que define em quantas
        // substrings a string será dividida
    }
}