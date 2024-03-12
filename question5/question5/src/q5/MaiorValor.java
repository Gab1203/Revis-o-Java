/*5. Implemente um programa em Java que encontre e exiba o maior valor
presente em um vetor de números inteiros fornecido pelo usuário.*/
package q5;
import java.util.Scanner;



public class MaiorValor {
	public int[] valores = new int[3]; 
	

	public void valorMaior(int[] valores) {
		
		int maiorValor = -1000000;
		
		for(int i = 0; i < valores.length; i++) {
			
			maiorValor = valores[i] > maiorValor ? valores[i] : maiorValor;
			
		}
		
		System.out.print("O maior valor dentre eles é: " + maiorValor);
		
	}
	
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	MaiorValor user = new MaiorValor();
	
	for(int i = 0; i < user.valores.length; i++) {
		
		System.out.printf("Digite o %d° valor:\n", i+1);
		user.valores[i] = scanner.nextInt();
		
	}
		System.out.print("\n");
		
		user.valorMaior(user.valores);
		
	}

}
