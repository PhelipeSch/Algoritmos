import java.util.Stack;
public class Exercicio_Sala {
    public static void main(String[] args) {
        
        Stack< String > pilha = new Stack();
        
        System.out.println(pilha.size());
        System.out.println(pilha.isEmpty());
        
        pilha.push("banana");
        pilha.push("manga");
        pilha.push("sapoti");
        pilha.push("maca");
        
        System.out.println(pilha.size());
        System.out.println(pilha.peek());//só mostra o elemento mais externo
        System.out.println(pilha.isEmpty());
        
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.size());
    }
}
