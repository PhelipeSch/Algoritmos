import java.util.Scanner;
public class ExercicioHJ {
    public static void main (String []args){
       Scanner leitor =  new Scanner (System.in);
        System.out.print("Digite o numero de um dia da semana sendo 1 Domingo e 7 Sabado:  ");
        int dia = leitor.nextInt ();
        switch(dia){
            case 1,7:
                System.out.println("Final de semana");
            break;
            case 2,3,4,5,6:
                System.out.println("Dia util");
            break;
            default:
                System.out.println("Nao consegui entender o que voce digitou");
           
        }
        System.out.println("Oie");
    }
}
