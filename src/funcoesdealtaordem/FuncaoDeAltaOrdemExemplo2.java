package funcoesdealtaordem;

import java.util.function.Function;

public class FuncaoDeAltaOrdemExemplo2 {

    public static void main(String[] args) {
    	
        // Função que duplica os valores
        Function<Integer, Integer> duplicar = multiplicador(2);
  
        int resultado = duplicar.apply(5);
        		
        System.out.println(resultado); 
    }
    
	// Função de alta ordem que retorna uma função de multiplicação
    public static Function<Integer, Integer> multiplicador(int fator) {
        return x -> x * fator;
    }
}
