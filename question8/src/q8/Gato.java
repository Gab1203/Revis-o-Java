/*8. Crie um programa em Java que contenha uma classe Animal e duas
subclasses, Cachorro e Gato. A classe Animal deve ter um m�todo
emitirSom(), e as subclasses devem sobrescrever esse m�todo com sons
espec�ficos.*/

package q8;

public class Gato extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("Miau!!!");
	}
	
	
	
	public static void main(String[] args) {
		Gato cat = new Gato();
		Cachorro dog = new Cachorro();
		
		
		cat.emitirSom();
		System.out.print("\n");
		dog.emitirSom();
		
		
		
	}
	
	
}
