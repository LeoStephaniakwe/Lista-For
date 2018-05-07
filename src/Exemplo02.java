import java.util.Scanner;

public class Exemplo02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a quantidade de" + "nomes que deseja cadastra:");
		int quantidadeDeRegistros = Integer.parseInt(teclado.nextLine());

		String[] nomes = new String[quantidadeDeRegistros];
		int[] idades = new int[quantidadeDeRegistros];
		double[] pesos = new double[quantidadeDeRegistros];
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Nome: ");
			nomes[i] = teclado.nextLine();

			System.out.print("Idade: ");
			idades[i] = Integer.parseInt(teclado.nextLine());

			System.out.print("Peso: ");
			pesos[i] = Double.parseDouble(teclado.nextLine());

		}
		for (int i = 0; i < idades.length; i++) {
			System.out.println("\nNome: " + nomes[i] + "\nIdade: " + idades[i] + "\nPeso: " + pesos[i]);
		}
		int somaIdades = 0;
		for (int i = 0; i < idades.length; i++) {
			somaIdades = somaIdades + idades[i];
		}
		System.out.println("A soma das idades é: " + somaIdades);
		double mediaIdades = somaIdades / idades.length;

		int menorIdade = Integer.MAX_VALUE;
		for (int i = 0; i < idades.length; i++) {
			int idadeAtual = idades[i];

			if (idadeAtual < menorIdade) {
				menorIdade = idadeAtual;
			}
		}

		int maiorIdade = Integer.MIN_VALUE;
		for (int i = idades.length - 1; i >= 0; i--) {
			if (idades[i] > maiorIdade) {
				maiorIdade = idades[i];
			}
		}
		System.out.println(
				"\nMenor Idade: " + menorIdade + "\nMaior Idade: " + maiorIdade + "\nMédia das Idades: " + mediaIdades);

	}
}
