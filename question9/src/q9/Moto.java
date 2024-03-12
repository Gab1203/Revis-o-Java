/*9. Escreva um programa em Java que tenha uma classe Veículo e duas
subclasses, Carro e Moto. A classe Veículo deve ter os atributos marca e
modelo, e as subclasses devem herdar esses atributos e ter um atributo
adicional, cilindrada.*/
package q9;

public class Moto extends Carro{
	
	
	
	public static void main(String[] args) {
		Carro car = new Carro();
		Moto moto = new Moto();
		
		car.marca = "Ford";
		car.modelo = "Ka";
		car.setCilindrada(100);
		
		moto.marca = "Hyundai";
		moto.modelo = "Pop 100";
		moto.setCilindrada(50);
		
		System.out.println(car.toString());
		System.out.print("\n");
		System.out.println(moto.toString());
	}

}
