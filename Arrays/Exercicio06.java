
import java.util.Arrays;

public class Exercicio06 {
    public static void main(String[] args) {
        
        int numeros [] = new int [100_000]; 
        
        
        for(int i = 0; i < numeros.length; i++){
            double random = Math.random();
            random = random * 1_000_000;
            random = Math.ceil(random);
            int inteiro = (int)random;
            numeros[i] = inteiro;
        }
        Arrays.sort(numeros);
        
        for(int i = 0; i< numeros.length; i++){
            System.out.println(numeros[i]);
        }
        
    }
}
