import java.util.Scanner;
public class Nono {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int media =0;
        
        for(int i=1; i<=10; i++){
            int idade = leitor.nextInt();
            if(idade<18){
                System.out.println("Menor de idade");
            }else{
                System.out.println("Maior de idade");
            }
            media += idade;
        }
        media /= 10;
        System.out.println("Media = "+media);
    }
    
    
}
