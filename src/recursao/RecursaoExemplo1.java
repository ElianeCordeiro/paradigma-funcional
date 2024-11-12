package recursao;

public class RecursaoExemplo1 {
    public static int fatorial(int n) {
       
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fatorial(n - 1);
    }

    public static void main(String[] args) {
        int resultado = fatorial(5);  
        System.out.println("O fatorial de 5 é: " + resultado);  
    }
}
