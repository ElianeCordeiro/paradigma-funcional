package composicaodefuncoes;

import java.util.function.Function;

public class ComposicaoDeFuncaoExemplo1 {
	public static void main(String[] args) {
		
		Function<Integer, Integer> adicionarTres = x -> x + 3;
		Function<Integer, Integer> multiplicarPorDois = x -> x * 2;
		
		//Composição das funções com andThen
		Function<Integer, Integer> adicionarEMultiplicar = adicionarTres.andThen(multiplicarPorDois);
		
		Integer resultado = adicionarEMultiplicar.apply(5);
		System.out.println("Resultado da composição: " + resultado);
	}
}
