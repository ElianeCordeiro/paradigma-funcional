package funcoesdealtaordem;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FuncaoDeAltaOrdemExemplo1 {

	public static void main(String[] args) {
		
		List<Integer> numeros =  Arrays.asList(1, 2, 4, 6, 8, 12);
		
		// Função de primeira ordem
		Function<Integer, Integer> duplicaNumeros = x -> x * 2;
		
		// Processamento funcionarl: filtra números pares e aplica a função de duplicar utilizando funções de alta ordem
		List<Integer> numerosParesDuplicados = numeros.stream()
				.filter(n -> n % 2 == 0)
				.map(duplicaNumeros)
				.collect(Collectors.toList());
		
		System.out.println(numerosParesDuplicados);
	}
}
