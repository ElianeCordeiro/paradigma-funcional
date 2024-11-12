package currying;
import java.util.function.Function;

public class FuncaoCurryingExemplo1 {

	 public static void main(String[] args) {
	        Function<Integer, Function<Integer, Integer>> multiplicacao = a -> b -> a * b;

	        int resultado = multiplicacao.apply(4).apply(6);
	        System.out.println("Resultado da multiplicação: " + resultado); 
	    }
	
	
}
