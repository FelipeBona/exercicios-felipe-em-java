
public class Mamifero extends Animal {
	private String corPelo;

	public void locomover() {
		System.out.println("Correndo");
	}

	public void alimentar() {
		System.out.println("Mamando");

	}

	public void emitirsom() {
		System.out.println("Som de Mamifero");

	}

	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

}
