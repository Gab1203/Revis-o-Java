/*7. Desenvolva um programa em Java que contenha duas classes: Pessoa e Aluno.
A classe Pessoa deve ter os atributos nome e idade, e a classe Aluno deve
herdar de Pessoa e ter um atributo adicional, matrícula.*/

package q7;

public abstract class Pessoa {

	protected String nome;
	protected int idade;
	
	
	public String toString() {
		return "Dados: nome = " + nome + ", idade = " + idade;
	}
	

	
	
	
}
