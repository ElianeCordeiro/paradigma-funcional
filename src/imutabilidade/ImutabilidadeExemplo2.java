package imutabilidade;

import java.util.List;
import java.util.stream.Collectors;

public class ImutabilidadeExemplo2 {
	 public static void main(String[] args) {
	        List<Integer> numeros = List.of(1, 2, 3, 4);
	        //Soltará uma exceção do tipo UnsupportedOperationException
	       // numeros.set(0, 0);
	        
	        // Em vez de modificar a lista original, criamos uma nova lista com os valores multiplicados por 2
	        List<Integer> numerosMultiplicados = numeros.stream()
	            .map(x -> x * 2)  
	            .collect(Collectors.toList()); 

	        System.out.println(numeros);           
	        System.out.println(numerosMultiplicados); 
	    }
}
