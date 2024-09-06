import java.util.LinkedList;
import java.util.Scanner;
public class Exercicio_08 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        LinkedList<Integer> pedidos = new LinkedList();
        LinkedList<Integer> PizzaS = new LinkedList();
        LinkedList<Integer> SuchiS = new LinkedList();
        LinkedList<Integer> PizzaD = new LinkedList();
        LinkedList<Integer> SuchiD = new LinkedList();
        LinkedList<Integer> Delivery = new LinkedList();
        LinkedList<Integer> Salao = new LinkedList();
        
        for(int i =0; i < 20; i++){
            System.out.println("Digite o numero do pedido desejado");
            System.out.println("[1] Pizza Salao");
            System.out.println("[2] Suchi Salao");
            System.out.println("[3] Pizza Delivery");
            System.out.println("[4] Suchi Delivery");
            
            int armaz = leitor.nextInt();
            pedidos.offer(armaz);
        }
        for(int i =0; i < 20; i++){
            int preparacao = pedidos.poll();
            
            if(preparacao == 1){
                PizzaS.offer(preparacao);
            }else{
                if(preparacao == 2){
                    SuchiS.offer(preparacao);
                }else{
                    if(preparacao == 3){
                        PizzaD.offer(preparacao);
                    }else{
                        SuchiD.offer(preparacao);
                    }
                }
            }
        }
        Salao.offer(PizzaS.size()+SuchiS.size());
        Delivery.offer(PizzaD.size()+SuchiD.size());
        
        System.out.println("Exstem "+Salao+" pedidos para o salao prontos");
        System.out.println("Exstem "+Delivery+" pedidos para o salao prontos");
    }
}
/*
Escreva um programa que crie uma fla para armazenar pedidos de um restaurante.
Os pedidos podem ser “pizza salao”, “pizza delivery”, “sushi salao” e “sushi delivery”.
Receba todos os pedidos (serão um total de 20.).
Em seguida, tire os pedidos da fila, e envie para outras duas filas de preparo: pizza e sushi.
Depois de alocar todos os pedidos nas filas de preparação, retire delas e insira em novas duas filas de entrega: salao e delivery.
*/