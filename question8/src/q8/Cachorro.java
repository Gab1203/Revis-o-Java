/*8. Crie um programa em Java que contenha uma classe Animal e duas
subclasses, Cachorro e Gato. A classe Animal deve ter um m�todo
emitirSom(), e as subclasses devem sobrescrever esse m�todo com sons
espec�ficos.*/

package q8;

public class Cachorro extends Animal{

	@Override
	public void emitirSom() {
		System.out.println("AUAU!!!");
	}

}
