/*10. Implemente uma classe que simule o comportamento de um Elevador dentro
de um pr�dio. A classe deve armazenar o andar atual (t�rreo = 0), total de
andares no pr�dio (desconsiderando o t�rreo), capacidade do elevador e
quantas pessoas est�o presentes nele. A classe deve tamb�m disponibilizar
os seguintes m�todos:
Construtor: que deve receber como par�metros a capacidade do elevador e
o total de andares no pr�dio (os elevadores sempre

come�am no t�rreo e vazios);
� Entrar: para acrescentar uma pessoa no elevador (s�
deve acrescentar se ainda houver espa�o);
� Sair: para remover uma pessoa do elevador (s� deve
remover se houver algu�m dentro dele);
� Subir: para subir um andar (n�o deve subir se j� estiver
no �ltimo andar)
� Descer: para descer um andar (n�o deve descer se j� estiver no
t�rreo);
� M�todos gets e sets para os atributos.
Escreva um programa que:
� Adicione o m�ximo de pessoas no elevador e depois tente adicionar
mais uma
� Suba at� o �ltimo andar e depois tente subir mais um andar
� Des�a at� o t�rreo e depois tente descer mais um andar
� Remova todas as pessoas do elevador e depois tente remover mais
uma*/

package q10;
import java.util.Scanner;

public class Elevador {
	private int andarAtual; 
	private int totalAndares;
	private int capacidade;
	private int quantidadePessoas;
	
	
	
	
	public Elevador( int totalAndares, int capacidade) {
		
		this.andarAtual = 0;
		this.totalAndares = totalAndares;
		this.capacidade = capacidade;
		this.quantidadePessoas = 0;
	}
	
	
	
	public int getAndarAtual() {
		return andarAtual;
	}
	public void setAndarAtual(int andarAtual) {
		this.andarAtual = andarAtual;
	}
	
	public int getTotalAndares() {
		return totalAndares;
	}
	public void setTotalAndares(int totalAndares) {
		this.totalAndares = totalAndares;
		
	}
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
		
	}
	public int getQuantidadePessoas() {
		return this.quantidadePessoas;
	}
	public void setQuantidadePessoas(int quantidadePessoas) {
		this.quantidadePessoas = quantidadePessoas;
	}
	
	public void entrar() {
		if(getQuantidadePessoas() < getCapacidade()) {
			
			setQuantidadePessoas(getQuantidadePessoas() + 1);
			System.out.println("Voc� adicionou uma pessoa!!!");
			
		}else {
			
			System.out.println("A capacidade m�xima de pessoas no elevador j� est� excedida!!!");
		}
		
	}
	
	public void sair() {
		
		if(getQuantidadePessoas() > 0) {
			
			setQuantidadePessoas(getQuantidadePessoas() - 1);
			System.out.println("Voc� removeu uma pessoa!!!");
			
			
		}else {
			
			System.out.println("N�o h� ningu�m no elevador!!!");
		}
		
	}
	
	public void subir() {
		
		if(getAndarAtual() < getTotalAndares()) {
			
			setAndarAtual(getAndarAtual() + 1);
			System.out.println("Voc� subiu um andar!!!");
			
		}else {
			
			System.out.println("Voc� j� est� no �ltimo andar, n�o pode subir!!!");
		}
		
	}
	
	public void descer() {
		
		if(getAndarAtual() > 0) {
			
			setAndarAtual(getAndarAtual() - 1);
			System.out.println("Voc� desceu um andar!!!");
			
		}else {
			
			System.out.println("Voc� j� est� no t�rreo, n�o pode descer!!!");
		}
		
	}
	
	
	public static void main(String[] args) {
		
		Elevador predio = new Elevador(5,5);
		
		predio.entrar();
		predio.entrar();
		predio.entrar();
		predio.entrar();
		predio.entrar();
		predio.entrar();
		
		predio.subir();
		predio.subir();
		predio.subir();
		predio.subir();
		predio.subir();
		predio.subir();
	
		
		predio.descer();
		predio.descer();
		predio.descer();
		predio.descer();
		predio.descer();
		predio.descer();
		
		
		predio.sair();
		predio.sair();
		predio.sair();
		predio.sair();
		predio.sair();
		predio.sair();
		
		
		
	}
	
	

}
