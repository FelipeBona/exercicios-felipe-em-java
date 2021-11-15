
public class ControleRemoto implements Controlador {
    
	// Atributos
	private int volume;
	private boolean ligando;
	private boolean tocando;
    
	//metodos especiais
	public ControleRemoto() {
		this.volume = 50;
		this.ligando = false;
		this.tocando = false;
	}

	private int getVolume() {
		return volume;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}

	private boolean getLigando() {
		return ligando;
	}

	private void setLigando(boolean ligando) {
		this.ligando = ligando;
	}

	private boolean getTocando() {
		return tocando;
	}

	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
 
	// metodos abstratos
	public void Ligar() {
		this.setLigando(true);

	}

	public void desLigar() {

		this.setLigando(false);
	}

	public void abrirMenu() {
		System.out.println("------MENU------");
		System.out.println("Está ligado? " + this.getLigando());
		System.out.println("Está tocando? " + this.getTocando());
		System.out.println("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i += 10) {
			System.out.println("|");
		}
		System.out.println("");
	}

	public void fecharMenu() {
		System.out.println("Fechando Menu...");

	}

	public void maisVolume() {
		if (this.getLigando()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossivel aumentar volume");
		}

	}

	public void menosVolume() {
		if (this.getLigando()) {
			this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossivel diminuir volume");
		}

	}

	public void ligarMudo() {
		if (this.getLigando() && this.getVolume() > 0) {
			this.setVolume(0);
		}

	}

	public void desligarMudo() {
		if (this.getTocando() && this.getVolume() == 0) {
			this.setVolume(50);
		}

	}

	public void play() {
		if (this.getLigando() && !(this.getTocando())) {
			this.setTocando(true);
		}

	}

	public void pause() {
		if (this.getLigando() && this.getTocando()) {
			this.setTocando(false);
		}

	}

}
