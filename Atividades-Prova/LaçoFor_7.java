import java.util.Random;
public class LaçoFor_7 {
    public static void main(String[] args) {
        Random Gerador = new Random();
        
        System.out.println("Foram gerados 20 numeros entre 1000 e 1999 e esses foram dividos por 11 e tiveram o resto 5:");
       
        for(int i = 0; i<=19; i++ ){
            
            int aleatorio = Gerador.nextInt(1000) + 1000;
            
            if(aleatorio % 11 == 5){
                System.out.println(aleatorio);
            }
            
        }
    }
}
/*
Construa um aplicativo em Java para gerar 20 números de 1000 a 1999 e mostrar aqueles que divididos por 11 deixam resto 5.
*/
