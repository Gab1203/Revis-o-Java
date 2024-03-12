package question2;
import java.util.ArrayList;



public class listaArray {
	
	public static void main(String [] args) {
		
		ArrayList<String> nomes = new ArrayList<String>();
		
		nomes.add("Gabriel");
		nomes.add("Leo");
		nomes.add("Pedro");
		
		//System.out.println(nomes);
		
		for(int i = 0; i < nomes.size(); i++) {
			
			System.out.printf("%d° nome: %s\n", i+1, nomes.get(i));
			
		}
		
		System.out.print("\n");
		nomes.remove(1);


nomes.add("Edu");

for(int i = 0; i < nomes.size(); i++) {
	
	System.out.printf("%d° nome: %s\n", i+1, nomes.get(i));
	
}

		
	}

}
