//package questao1;

public class Somador {

	public int[] numeros = new int[] { 1, 2, 4, 8, 16 };

	public int somar() {
		int soma = 0;

		for (int i = 0; i < numeros.length; i++) {

			soma += this.numeros[i];

		}

		return soma;
	}

	public static void main(String[] args) {

		Somador sum = new Somador();

		for (int i = 0; i < sum.numeros.length; i++) {

			System.out.println(i + 1 + " número: " + sum.numeros[i]);

		}

		System.out.print("\n");
		;
		System.out.println("Soma dos nÃºmeros " + sum.somar());

	}

}
