/*6. Crie um programa em Java que receba um ArrayList de números inteiros e
verifique se um determinado número fornecido pelo usuário está presente
na lista.*/
package q6;
import java.util.Scanner;
import java.util.ArrayList;



public class VerificaArray {
	
private int valor;

public int getValor() {
	
	return this.valor;
}
	
public void setValor(int valor) {
	
	this.valor = valor;
}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Integer> inteiros = new ArrayList<Integer>();
		VerificaArray user = new VerificaArray();
		
		inteiros.add(10);
		inteiros.add(40);
		inteiros.add(12);
		inteiros.add(5);
		
		
		System.out.println("Digite um número que possa estar no array:");
		user.setValor(scanner.nextInt());
		
		for(int i = 0; i < inteiros.size(); i++) {
			
			System.out.printf("%d° número do array: %d\n", i+1, inteiros.get(i));
		
			
		}
		
		for(int i = 0; i < inteiros.size(); i++) {
			
			if(user.getValor() == inteiros.get(i)) {
				
				System.out.printf("\nO número digitado é idêntico ao número %d do array!!!\n", inteiros.get(i));
				
			}
			
		}
		
		
		
	}
	

}
