/*10. Implemente uma classe que simule o comportamento de um Elevador dentro
de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de
andares no prédio (desconsiderando o térreo), capacidade do elevador e
quantas pessoas estão presentes nele. A classe deve também disponibilizar
os seguintes métodos:
Construtor: que deve receber como parâmetros a capacidade do elevador e
o total de andares no prédio (os elevadores sempre

começam no térreo e vazios);
• Entrar: para acrescentar uma pessoa no elevador (só
deve acrescentar se ainda houver espaço);
• Sair: para remover uma pessoa do elevador (só deve
remover se houver alguém dentro dele);
• Subir: para subir um andar (não deve subir se já estiver
no último andar)
• Descer: para descer um andar (não deve descer se já estiver no
térreo);
• Métodos gets e sets para os atributos.
Escreva um programa que:
• Adicione o máximo de pessoas no elevador e depois tente adicionar
mais uma
• Suba até o último andar e depois tente subir mais um andar
• Desça até o térreo e depois tente descer mais um andar
• Remova todas as pessoas do elevador e depois tente remover mais
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
			System.out.println("Você adicionou uma pessoa!!!");
			
		}else {
			
			System.out.println("A capacidade máxima de pessoas no elevador já está excedida!!!");
		}
		
	}
	
	public void sair() {
		
		if(getQuantidadePessoas() > 0) {
			
			setQuantidadePessoas(getQuantidadePessoas() - 1);
			System.out.println("Você removeu uma pessoa!!!");
			
			
		}else {
			
			System.out.println("Não há ninguém no elevador!!!");
		}
		
	}
	
	public void subir() {
		
		if(getAndarAtual() < getTotalAndares()) {
			
			setAndarAtual(getAndarAtual() + 1);
			System.out.println("Você subiu um andar!!!");
			
		}else {
			
			System.out.println("Você já está no último andar, não pode subir!!!");
		}
		
	}
	
	public void descer() {
		
		if(getAndarAtual() > 0) {
			
			setAndarAtual(getAndarAtual() - 1);
			System.out.println("Você desceu um andar!!!");
			
		}else {
			
			System.out.println("Você já está no térreo, não pode descer!!!");
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
