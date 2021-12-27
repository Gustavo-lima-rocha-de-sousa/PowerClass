package class_StringBuilder;

public class Mtd_reverse {
    public static void main(String[] args) {
        
        //esse metodo inverte a ordem da sequencia de caracteres, de forma que o ultimo 
        //caractere se torna o primeiro e assim por diante. Nao possui parametros e o 
        //retorno é do tipo StringBuilder

        //pode ser uma etapa num processo de criptografia para melhorar a segurança
        //no que se refere a acessar essa informação
        StringBuilder senhaForte = new StringBuilder("abacaxif3rvenTe191");
        StringBuilder senhaCriptografada = senhaForte.reverse();
        
        System.out.println(senhaCriptografada);
    }   
}
