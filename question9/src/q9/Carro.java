/*9. Escreva um programa em Java que tenha uma classe Veículo e duas
subclasses, Carro e Moto. A classe Veículo deve ter os atributos marca e
modelo, e as subclasses devem herdar esses atributos e ter um atributo
adicional, cilindrada.*/
package q9;

public class Carro extends Veiculo{
	
	private double cilindrada;

	public void setCilindrada(double cilindrada) {
		
		this.cilindrada = cilindrada;
	}
	
	public double getCilindrada() {
		
		return this.cilindrada;
	}
	
	public String toString() {
		return "Dados: Cilindrada = " + cilindrada + ", Marca = " + marca + ", Modelo = " + modelo;
	}
	
	
	

}
