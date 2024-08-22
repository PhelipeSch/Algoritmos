import java.util.Scanner;
import java.util.ArrayList;
public class Exercicio_01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        ArrayList<String> minhaLista = new ArrayList();
        
        minhaLista.add("banana");
        minhaLista.add("leite");
        minhaLista.add("pao");
        minhaLista.add("presunto");
        
        int numElementos = minhaLista.size();
        System.out.println(numElementos);
        
        boolean estaVazia = minhaLista.isEmpty();
        System.out.println(estaVazia);
        
        String elemento = minhaLista.get(2);
        System.out.println(elemento);
        
        minhaLista.add(2, "desinfetante");
        
        elemento = minhaLista.get(2);
        System.out.println(elemento);
        
        boolean encontrou = minhaLista.contains("vassoura");
        System.out.println(encontrou);
        
        encontrou = minhaLista.contains("leite");
        System.out.println(encontrou);
        
        int indice = minhaLista.indexOf("presunto");
        System.out.println(indice);
        
        indice = minhaLista.indexOf("batata");
        System.out.println(indice);
        
        boolean removepao = minhaLista.remove("pao");
        System.out.println(removepao);
        
        boolean removesla = minhaLista.remove("palito");
        System.out.println(removesla);
        
        
    }
}