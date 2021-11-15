
public class Peixe extends Animal {
	private String corEscama;

	public void locomover() {
		System.out.println("Nadando");

	}

	public void alimentar() {
		System.out.println("Comendo Substancias");
	}

	public void emitirsom() {
		System.out.println("Peixe não faz som ");

	}

	public void soltarBolha() {
		System.out.println("Soltando Bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
