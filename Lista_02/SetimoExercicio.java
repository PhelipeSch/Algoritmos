public class SetimoExercicio {
    public static void main(String[] args) {
        
        double soma = 0.0;
        
        for(int inv = 2; inv <= 10; inv++){
            
            soma += Math.pow(inv, -1);
        }
        System.out.println("A soma dos inversos entre 2 e 10 eh: " + soma);
    }
    
}
