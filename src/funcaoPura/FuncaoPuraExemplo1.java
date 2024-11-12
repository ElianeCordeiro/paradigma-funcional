package funcaoPura;

public class FuncaoPuraExemplo1 {
	
    public static int somar(int a, int b) {
        return a + b;
    }
	
    public static void main(String[] args) {
        int resultado1 = somar(5, 10);  
        int resultado2 = somar(5, 10);  

        System.out.println("Resultado 1: " + resultado1);  
        System.out.println("Resultado 2: " + resultado2);  
    }
	
}
