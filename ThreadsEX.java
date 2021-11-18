
public class ThreadsEX extends Thread {

	private String nome;
	private int tempo;

	public ThreadsEX(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		// iniciar a thread aqui no contrutor
		start();
	}

	// sobrescrever o metodo Run
	public void run() {
		try {
			for (int i = 1; i < 6; i++) {
				System.out.println(this.nome + "-->>" + i);
				Thread.sleep(tempo); // aumentar o tempo de espera
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução....");
	}

}
