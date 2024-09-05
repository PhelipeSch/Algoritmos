import java.util.ArrayList;
public class Exercicio_09 {
    static final int TAMANHO = 10_000_000;
    static ArrayList <Integer> lista = new ArrayList();
    public static void main(String[] args) {
        
        for(int i=0; i<10_000_000; i++){
            lista.add((int) Math.rint(Math.random() *1_000_000));
        }
        
        for(int i = 0;i<100; i++){
            int comp;
            
            int numero = (int) Math.rint(Math.random() * 1_000_000);
            
            for(comp = 0; comp < lista.size() && numero != lista.get(comp); comp++){
            }
            System.out.println("Comparacoes: "+ comp);
        }
    }
}
