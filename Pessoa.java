
public class Pessoa {
	private String nome;
	private int idade;
	private String sexo;
 
	// metodo interno
	public void fazerAniversario() {
		this.idade++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void getIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void getSexo(String sexo) {
		this.sexo = sexo;
	}

	
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + ", sexo=" + sexo + "]";
	}

}
