package composicaodefuncoes;

import java.util.function.Function;

public class ComposicaoDeFuncaoExemplo2 {
	
	public static void main(String[] args) {
		Function<String, String> paraMaiusculas = String::toUpperCase;
		Function<String, String> removerEspacos =  String::trim;
		
		//Composição das funções com compose
		Function<String, String> processarString = removerEspacos.compose(paraMaiusculas);
		
		String resultado = processarString.apply("    composição de funções        ");
		System.out.println(resultado);
	}
}
