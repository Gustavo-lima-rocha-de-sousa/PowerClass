package class_StringBuilder;

import java.lang.StringBuilder;

public class Mtd_insert {

   public static void main(String[] args) {
  
      //o metodo insert insere no caractere mencionado no primeiro parametro do tipo int
      //uma string mesmo se esse espaco ja tiver sido usado, nesse caso os caracteres se
      //deslocarao para os espacos seguintes

      StringBuilder str = new StringBuilder("pneumoultramicroscopicossilicovulcanoconiótico");
      System.out.println("string antes da insercao = " + str);

      str.insert(10, "QQQ");

      System.out.print("Depois da insercao = ");
      System.out.println(str.toString());
   }      
} 