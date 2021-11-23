import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class GeradorParcela {

	public static List<Parcela> gerarParcelas(LocalDate dataCompra, BigDecimal valorTotalCompra, int numeroParcelas) {

		List<Parcela> parcelas = new ArrayList<>();

		BigDecimal valorParcela = valorTotalCompra.divide(new BigDecimal(numeroParcelas), 2, RoundingMode.HALF_EVEN);

		LocalDate dataVencimentoAux = dataCompra;
		dataVencimentoAux.withDayOfMonth(10);

		for (int i = 0; i < numeroParcelas; i++) {

			parcelas.add(new Parcela(i + 1, LocalDate.now(), valorParcela));

		}

		BigDecimal resto = valorTotalCompra.remainder(valorParcela);
		if (!resto.equals(BigDecimal.ZERO)) {
			Parcela parcela = parcelas.get(0);
			parcela.setValor(parcela.getValor().add(resto));
		}

		return parcelas;

	}

	private boolean isDia10() {
		return LocalDate.now().getDayOfMonth() == 10;
	}

	public static void main(String[] args) {

		List<Parcela> parcelas = GeradorParcela.gerarParcelas(LocalDate.of(20121, Month.NOVEMBER, 8),
				new BigDecimal(100), 3);

		System.out.println("Numero de parcelas" + parcelas.size());

		for (Parcela parcela : parcelas) {
			System.out.println(String.format("%s - %s - %s", parcela.getNumero(), parcela.getDataVencimento(),
					parcela.getValor()));

		}

	}
}
