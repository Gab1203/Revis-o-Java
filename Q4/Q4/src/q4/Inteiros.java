package q4;
import java.util.ArrayList;

public class Inteiros {
	
	public static void main(String [] args) {
		
		int soma = 0;
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(10);
		numeros.add(15);
		numeros.add(2);
		numeros.add(5);
		
		
		for(int i = 0; i < numeros.size(); i++) {
			System.out.printf("%d° número: %d\n", i+1, numeros.get(i));
			
			soma += numeros.get(i);
			
		}
		
		System.out.println("Soma dos elementos = " + soma + "\n");
	}

}
