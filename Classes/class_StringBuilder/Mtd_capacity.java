package class_StringBuilder;

public class Mtd_capacity {

    public static void main(String[] args) {
        StringBuilder textoBlog = new StringBuilder("Lorem ipsum dolor sit amet. "
        + "Dolores nihil At dolorem quasi cum aliquid magnam et culpa harum et fuga corporis aut similique dignissimos."
        + "Est obcaecati unde aut incidunt saepe non nisi maiores sit internos harum et voluptatem dolor aut similique rerum aut culpa quia. ");
   
        if(textoBlog.length() <= 200)
        {
            System.out.println("Texto enviado");
        }
        else
        {
            System.out.println("Por favor, reduza o número de caracteres");
        }
    }

}
