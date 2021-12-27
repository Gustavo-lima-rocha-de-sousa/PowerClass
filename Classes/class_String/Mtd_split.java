package class_String;

public class Mtd_split {
    public static void main(String[] args) {    
   
        // o metodo split() divide uma determinada string em varias partes com base num padrao do tipo String
        // que e dado como parametro, retornando um vetor de strings
        
        String compras = "macarrao cereija gelatina arroz champignon abacaxi";

        String[] lista = compras.split(" ");

        for(String alimento : lista)
            System.out.println(alimento);

        System.out.println("------------------");
        
        // esse metodo e sobrecarregado, podendo receber um segundo parametro do tipo int que define em quantas
        // substrings a string sera! dividida.
        
        String valor = "Colaboradores - Daniel - Jonas - Arthur - Claudia - Eddward - Gustavo - Henrique - Lais";
        String[] valorComSplit = valor.split("-", 2);
        for(String s : valorComSplit){
               System.out.println(s);
        }

    }
}