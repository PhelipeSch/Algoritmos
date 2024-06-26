public class Terceiro {
    public static void main(String[] args) {
        
        for(double i = 0; i<=2; i+=0.2){
            for(double j = 1+i; j<=3+i; j+= 1.0){
                System.out.println("I = "+i + "  J = "+j);
            }
        }
    }
}