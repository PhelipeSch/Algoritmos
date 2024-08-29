import java.util.LinkedList;
public class Exercicio_Sala {
    public static void main(String[] args) {
        LinkedList<Double>fila = new LinkedList();
        System.out.println(fila.size());
        System.out.println(fila.isEmpty());
        
        fila.offer(10.5);
        fila.offer(37.6);
        fila.offer(98.9);
        
        System.out.println(fila.size());
        System.out.println(fila.peek());
        System.out.println(fila.size());
        
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.size());
    }
}
 