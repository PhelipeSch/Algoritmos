import java.util.ArrayList;
import java.util.Collections;
public class Exercicio_10 {
    static ArrayList <Integer> lista = new ArrayList();
    
    public static void main(String[] args) {
        
         for(int i=0; i<1_000_000; i++){
            lista.add((int) Math.rint(Math.random() *1_000_000));
         }
         Collections.sort(lista);
         for(int i =0; i<100; i++){
             int comp=0;
             int numero = (int) Math.rint(Math.random() * 1_000_000);
             int primeiro = 0, ultimo = lista.size()-1;
             int pivo;
             
             do{
                pivo = (primeiro+ ultimo)/2;
                
                if(numero <lista.get(pivo)){
                   ultimo = pivo-1; 
                }else{
                    if(numero > lista.get(pivo));
                        primeiro = pivo +1;
                    }
                comp++;
            }while(numero != lista.get(pivo) && primeiro <= ultimo);
            
             System.out.println("O numero de comparacoes foi de: "+comp);
         }
    }
}