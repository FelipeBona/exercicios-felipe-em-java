
public class Reptil extends Animal {
	private String corEscama;

	public void locomover() {
		System.out.println("Rastejando");

	}

	public void alimentar() {
		System.out.println("Comendo Vegetais");

	}

	public void emitirsom() {
		System.out.println("Som de Réptil");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
