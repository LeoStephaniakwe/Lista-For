import java.util.Random;

public class Exemplo01 {

	public static void main(String[] args) {
		int[] numeros = new int[10];
		Random random = new Random();

		for (int i = 0; i < 10; i++) {
			numeros[i] = random.nextInt(100);

		}
		for (int i = 0; i < 10; i++) {
			System.out.println(numeros[i]);
		}
	}

}
