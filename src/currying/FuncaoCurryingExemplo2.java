package currying;
import java.util.function.Function;


public class FuncaoCurryingExemplo2 {
    
    public static Function<String, Function<String, Function<String, Function<String, String>>>> temperar() {
        return alho -> sal -> pimenta -> alimento -> 
            "Temperando " + alimento + " com " + alho + ", " + sal + " e " + pimenta;
    }

    public static void main(String[] args) {
 
        Function<String, Function<String, Function<String, String>>> temperoDeAlho = temperar().apply("alho");
        Function<String, Function<String, String>> temperoDeSal = temperoDeAlho.apply("sal");
        Function<String, String> temperoDePimenta = temperoDeSal.apply("pimenta");
        
        System.out.println(temperoDePimenta.apply("frango"));
    }
}

