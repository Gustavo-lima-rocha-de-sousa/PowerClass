package class_String;

public class Mtd_toUpperCase {
    public static void main(String[] args) {
        
        String[] nomes = {"Lana Del Rey", "mARINA SENA","duda beat"};
        
        for(String nome : nomes){
            nome = nome.toUpperCase();
            System.out.println(nome);
        }
    }   
}