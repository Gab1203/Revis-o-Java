/*6. Crie um programa em Java que receba um ArrayList de n�meros inteiros e
verifique se um determinado n�mero fornecido pelo usu�rio est� presente
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
		
		
		System.out.println("Digite um n�mero que possa estar no array:");
		user.setValor(scanner.nextInt());
		
		for(int i = 0; i < inteiros.size(); i++) {
			
			System.out.printf("%d� n�mero do array: %d\n", i+1, inteiros.get(i));
		
			
		}
		
		for(int i = 0; i < inteiros.size(); i++) {
			
			if(user.getValor() == inteiros.get(i)) {
				
				System.out.printf("\nO n�mero digitado � id�ntico ao n�mero %d do array!!!\n", inteiros.get(i));
				
			}
			
		}
		
		
		
	}
	

}
