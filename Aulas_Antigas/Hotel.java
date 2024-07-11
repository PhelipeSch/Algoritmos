import java.util.Scanner;
public class Hotel {
    public static void main(String []args){
        Scanner leitor = new Scanner (System.in);
        System.out.println("Ola! O que voce gostaria de fazer?");
        System.out.println("Para fazer Chek-in digite 1");
        System.out.println("Para chamar o Servico de Quarto digite 2");
        System.out.println("Para fazer um Pedido digite 3");
        System.out.println("O que voce quer?:  ");
        int escolha = leitor.nextInt();
        
        switch(escolha){
            case 1:
                System.out.println("Chame algum dos nossos recepcionistas para iniciar o Check-in!");
            break;
            case 2:
                System.out.println("Para chamar o servico de quarto fale com um de nossos atendentes ou agende no site");
            break;
            case 3:
                System.out.println("Os pedidos sao feitos pelo nosso site www.booking.com.uk");
            default:
                System.out.println("Nao entendi o que você digitou!");
        }
        
        
    }
    
}
