import java.util.Arrays;
import java.util.List;

public class Lambda {
public static void main(String[] args) {
	
List<Integer> lista = Arrays.asList(1,2,5,7,9,7);

//for (Integer numero : lista) {
//	System.out.println(numero);
//}

//lista.stream().forEach(e -> System.out.println(e));
  
      
lista.stream()
.filter(e -> e == 8)
.distinct()
.forEach(e -> System.out.println(e));

}
}
