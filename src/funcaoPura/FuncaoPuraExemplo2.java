package funcaoPura;

public class FuncaoPuraExemplo2 {
	
	
	    public static int calcularArea(int largura, int altura) {
	        return largura * altura;
	    }

	    public static void main(String[] args) {
	        int area1 = calcularArea(5, 10);  
	        int area2 = calcularArea(5, 10);  

	        System.out.println("Área 1: " + area1);  
	        System.out.println("Área 2: " + area2);  
	    }
	}


