import java.math.BigDecimal;
import java.time.LocalDate;

public class Parcela {

	private Integer numero;
	private LocalDate dataVencimento;
	private BigDecimal valor;
	
  public Parcela() {
	  
  }
	
	public Parcela(Integer numero, LocalDate dataVencimento, BigDecimal valor) {
		super();
		this.numero = numero;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}
	
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
     
    
}
