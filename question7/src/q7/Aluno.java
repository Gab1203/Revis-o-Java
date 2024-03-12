/*7. Desenvolva um programa em Java que contenha duas classes: Pessoa e Aluno.
A classe Pessoa deve ter os atributos nome e idade, e a classe Aluno deve
herdar de Pessoa e ter um atributo adicional, matrícula.*/

package q7;



public class Aluno extends Pessoa{
	
	private String matricula;
	
	public void setMatricula(String matricula) {
		
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		
		return this.matricula;
	}
	
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
		
		aluno.nome = "Gabriel";
		aluno.idade = 22;
		aluno.setMatricula("0001");
		
		System.out.print(aluno.toString() + " ,matricula = " + aluno.getMatricula()); 
		
		
	}

}
