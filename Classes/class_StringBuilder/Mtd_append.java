package class_StringBuilder;

public class Mtd_append {
	public static void main(String[] args) {
	
	//o metodo append recebe como argumento uma string que sera concatenada pela qual esta chamando o metodo.
	//serve para otimizar o uso de memória pois concatenar com String aloca espasos de memoria desnecessariamente
	//o que em alguns casos pode causar muita diferenca de tempo do processamento

	StringBuilder nomes = new StringBuilder();
		nomes.append("Eddward > ").append("Daniel > ").append("Lais > ").append("Claudia > ").append("Jonas > ").append("Arthur > ")
		.append("Henrique > ").append("Gustavo.");

		System.out.println(nomes); 
	}
}
