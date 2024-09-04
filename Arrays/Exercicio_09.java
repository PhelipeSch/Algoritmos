import java.util.ArrayList;
public class Exercicio_09 {
    static final int TAMANHO = 10_000_000;
    static ArrayList <Integer> lista = new ArrayList();
    public static void main(String[] args) {
        
        for(int i=0; i<1_000_000; i++){
            int comp;
            lista.add((int) Math.rint(Math.random() *1_000_000));
            int numero = (int) Math.rint(Math.random() * 1_000_000);
            int elemento = lista.get(i);
            
            for(comp = 0; comp <lista.size() && numero != lista.get(comp); comp++){
            }
            
                System.out.println(comp);
            
        }
    }
}

