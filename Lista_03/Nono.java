import java.util.Scanner;
public class Nono {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int media =0;
        
        for(int i=1; i<=10; i++){
            
            System.out.print("Digite a idade: ");
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
        
        int contador =0;
        
        while(contador <= 10){
            contador++;
            
            System.out.print("Digite a idade: ");
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
        
          contador =0;
          media = 0;
          
        do  {
            contador++;
            System.out.print("Digite a idade: ");
            int idade = leitor.nextInt();
            if(idade<18){
                System.out.println("Menor de idade");
            }else{
                System.out.println("Maior de idade");
            } 
            media += idade;
            }while(contador < 10);
        media /= 10;
        System.out.println("Media = " + media);
    }
}