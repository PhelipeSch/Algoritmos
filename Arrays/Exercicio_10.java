import java.util.ArrayList;
public class Exercicio_10 {
    static final int TAMANHO = 10_000_000;
    static ArrayList <Integer> lista = new ArrayList();
    public static void main(String[] args) {
         for(int i=0; i<1_000_000; i++){
            int comp;
            lista.add((int) Math.rint(Math.random() *1_000_000));
            int numero = (int) Math.rint(Math.random() * 1_000_000);
            int primeiro = 0, ultimo = lista.size()-1;
            int pivo;
            do{
                pivo = (primeiro+ ultimo)/2;
                
                if(numero <lista.get(i)){
                   ultimo = pivo-1; 
                }else{
                    
                    if(numero > lista.get);
                        primeiro = pivo +1;
                    }
                comp++;
            }while(numero != vetor[pivo] && primeiro <= ultimo);
         }
    }
}
