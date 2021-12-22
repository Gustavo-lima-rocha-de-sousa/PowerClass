# PowerClass


Abordaremos as seguintes classes: 
* **Java.lang.String**
* **Java.util.StringJoiner**
* **Java.lang.StringBuilder**

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

#### Colaboradores
* *Daniel* *Santos*
* *Arthur* *Kayser*
* *Lais* *Costa*
* *Eddward* *Messias*
* *Jonas* *Souza*
* *Henrique* *Cordeiro*
* *Claudia* *A*
* *Gustavo* *Lima*
