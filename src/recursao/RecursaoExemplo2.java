package recursao;

public class RecursaoExemplo2 {
	
    public static int fibonacci(int n) {
      
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
      
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 6;  
        int resultado = fibonacci(n);
        System.out.println("O " + n + "º número de Fibonacci é: " + resultado);  
    }
}
