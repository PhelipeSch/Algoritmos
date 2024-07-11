public class TerceiroExercicio {
    public static void main(String[] args) {
        
        for(int numero = 1; numero<1000; numero++){
            
            if( numero%2 == 0){
                
                int quadrado = numero*numero;
                
                System.out.println("O quadrado de " + numero + " eh: "+quadrado);
            }
        }
    }
}
