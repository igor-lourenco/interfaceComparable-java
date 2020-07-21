package entidades;

public class Funcionario implements Comparable<Funcionario>{
	
	private String nome;
	private Double salario;
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override 
	public int compareTo(Funcionario outro) {
		//esse método serve para comparar um objeto com o outro
		return -salario.compareTo(outro.getSalario());
	}
	
	

}
