package class_String;

public class Mtd_toUpperCase {
	public static void main(String[] args) {

		String[] nomes = { "Lana Del Rey", "mARINA SENA", "duda beat" };

		for (String nome : nomes) {
			nome = nome.toUpperCase();
			System.out.println(nome);

			//toUpperCase serve para padronizar um estilo de input que o usuario enviar, conforme o exemplo e transforma tudo em maiusculo.
			//Ao contraio desse metodo temos o toLowerCase que serve para deixar o padrao minisculo.
		}
	}
}