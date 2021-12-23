# PowerClass


Abordaremos as seguintes classes: 
* **Java.lang.String**
* **Java.util.StringJoiner**
* **Java.lang.StringBuilder**

#### Colaboradores
* *Daniel* *Santos*
* *Arthur* *Kayser*
* *Lais* *Costa*
* *Eddward* *Messias*
* *Jonas* *Souza*
* *Henrique* *Cordeiro*
* *Claudia* *A*
* *Gustavo* *Lima*
----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# | String |
String representa uma sequência de caracteres. As notação de string em programas Java, como por exemplo "abc", são implementados como instâncias desta classe. Os valores não podem sofrer alterações após sua criação.  As estrutura são constantes. Já os buffers de string suportam strings mutáveis, bem como, os objetos String são permanentes, ou seja, podem ser compartilhados. 
Por exemplo: 
  public class Example{
    public static void main(String[] args) { 
        
        // String str = "abc";
         System.out.println("abc");
         String cde = "cde";
         System.out.println("abc" + cde);
         String c = "abc".substring(2,3);
          String d = cde.substring(1, 2);
          
Essa classe integra métodos para averiguar caracteres particulares da sequência, para realizar a contraposição de strings, para realização de pesquisas, para  extração de substrings e para criação de um clone e de uma string, sendo eles retratados em minúsculos e maiúsculos, já a esquematização de caso é embasado na versão padrão Unicode descrito pela classe Character. 
Diferente da classe StringJoiner, não tem necessidade de importação de biblioteca, podendo ser utilizado no método main.

#### **Teste String Console**

![image](https://user-images.githubusercontent.com/72114370/147277242-6f6b2617-2b53-4144-85b3-a58d5742aa24.png)

# | StringJoiner |
É uma classe java que é utilizada para juntar Strings, também é possível ja passar delimitadores, prefixos e sufixos ao juntar strings

##### Exemplo:
import java.util.StringJoiner;  
public class Example {  
    public static void main(String[] args) {  
    	/* Passing comma(,) as delimiter and opening bracket
    	 * "(" as prefix and closing bracket ")" as suffix
    	 */
        StringJoiner mystring = new StringJoiner(",", "(", ")");    
          
        // Joining multiple strings by using add() method  
        mystring.add("Negan");  
        mystring.add("Rick");  
        mystring.add("Maggie");  
        mystring.add("Daryl");  
(Negan,Rick,Maggie,Daryl)

Diferente da classe String, Tem necessidade de importação de biblioteca, podendo ser utilizado no método main.
<br/>

#### **Teste StringJoiner Console**

![image](https://user-images.githubusercontent.com/72114370/147014461-446f9d70-acca-4856-9a96-25025702f3c2.png)

# | StringBuilder |

A classe StringBuilder permite criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.

#### **Características StringBuilder**
* Armazena caracteres especificados pela sua capacidade, caso ela seja excedida, é aumentada para acomodar os caracteres adicionais;
* Não precisa alocar novos objetos quando realiza uma concatenação;
* Não são sincronizadas;
* Não são seguras para threads;

Uma diferença entre a classe String e a classe String Builder é que para concatenação é invocado o método append. Esse método aloca novas strings concatenadas para o mesmo objeto, então cada vez que concatena strings não são criadas cópias dos objetos como é realizado pelo método concat da classe String, contribuindo para um melhor desempenho do sistema.

      public class desafio1 {
      
      public static void main(String[] args) {
  
 		 StringBuilder nomes = new StringBuilder();
		 nomes.append("Eddward>").append("Daniel>").append("Lais>").append("Claudia>").append("Jonas>").append("Arthur>")
		 .append("Henrique>").append("Gustavo>");
		 System.out.println(nomes.toString());
	}
	}	

#### **Teste StringBuilder Console**
![image](https://user-images.githubusercontent.com/72114370/147277906-c777454d-2e07-4afb-ba78-cc430572e4c6.png)
