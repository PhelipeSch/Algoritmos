import java.util.Scanner;
public class Angulacao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o numero de um angulo:");
        double angulo = leitor.nextDouble();
        
        if(angulo == 90){
            System.out.println("Angulo reto");
        }
        else{
            if( angulo<90 ){
                System.out.println("Angulo agudo");
            }
            else{
                System.out.println("Angulo obtuso");
            }
        }
    }
    
}
