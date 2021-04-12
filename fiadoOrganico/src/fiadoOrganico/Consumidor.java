package fiadoOrganico;

public class Consumidor {
	
	// Atributos
	// PACKAGE -PUBLIC - PROTECTED - PRIVATE
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private String telefone;
	
	
	
	// Construtor
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int [10];
		
				
	}
	
	// GETTER E SETTER
	
	public String getNome( ) {		
		return this.nome;		
	}
	
	public String getTelefone() {
		return this.telefone;
		
	}
	
	public void setNome (String nome) {
		
		this.nome = nome;		
	}
	
	public void setTelefone (String tel) {
		
		this.telefone = tel;
	}
	
	public void registrarFiado (int valor) {
		
		this.fiados[posicao]= valor;
		posicao++;
		
	}
	
	public void registrarTelefone (int valor) {
		
		this.Telefone[]= valor;
		posicao++;
		
	}
	
	public int getFiado()  {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
			
		}
		
		return total;
	}
	
}

