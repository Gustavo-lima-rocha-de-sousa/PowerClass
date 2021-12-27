package class_StringBuilder;

public class Mtd_append {
	public static void main(String[] args) {
	
	//o metodo append recebe como argumento uma string que será concatenada pela qual está chamando o método.
	//serve para otimizar o uso de memória pois concatenar com String aloca espaços de memória desnecessariamente
	//o que em alguns casos pode causar muita diferença de tempo do processamento

	StringBuilder nomes = new StringBuilder();
		nomes.append("Eddward > ").append("Daniel > ").append("Lais > ").append("Claudia > ").append("Jonas > ").append("Arthur > ")
		.append("Henrique > ").append("Gustavo.");

		System.out.println(nomes); 
	}
}
