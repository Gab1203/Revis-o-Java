package q3;
import java.util.Scanner;

public class mediaVetor {
	
	
	public static double mediaNumbers(int[] numeros) {
		
		double media = 0;
		double soma = 0;
		
		for(int i = 0; i < numeros.length; i++) {
			
			soma += numeros[i];
			
			
		}
		
		
		return soma/numeros.length;
	}
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		int[] numeros = new int[4];
		
		
		for(int i = 0; i < numeros.length; i++) {
			
			System.out.printf("Digite o %d° número:\n", i+1);
			numeros[i] = reader.nextInt();
			
		}
		
		System.out.printf("Média dos números: %.2f", mediaNumbers(numeros));
		
		
	}

}
