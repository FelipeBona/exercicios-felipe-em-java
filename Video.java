
public class Video implements Acoesvideo {
   private String titulo;
   private int avaliacoes;
	private int views;
	private int curtidas;
	private boolean reproduzir;
	
	
	public Video(String titulo) {
		this.titulo = titulo;
		this.avaliacoes = 1;
		this.views = 0;
		this.curtidas = 0;
		this.reproduzir = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(int avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public boolean isReproduzir() {
		return reproduzir;
	}

	public void setReproduzir(boolean reproduzir) {
		this.reproduzir = reproduzir;
	}

	@Override
	public void play() {
		this.reproduzir = true;
		
	}

	@Override
	public void pause() {
		this.reproduzir = false;
		
	}

	@Override
	public void like() {
	this.curtidas++;
		
	}

	@Override
	public String toString() {
		return "Video [titulo=" + titulo + ", avaliacoes=" + avaliacoes + ", views=" + views + ", curtidas=" + curtidas
				+ ", reproduzir=" + reproduzir + "]";
	}

}
