import java.util.Scanner;
public class Quinto {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        String numeros = leitor.nextLine();
        
        char atual = numeros.charAt(0);
        char prox = numeros.charAt(1);
        
        for(int i = 2;  i <numeros.length() && atual != prox; i++){
            atual = numeros.charAt(i-1);
            prox = numeros.charAt(i);
        }
        if(atual==prox){
            System.out.println("Encontrei um par");
        }else{
            System.out.println("Nao foi encontrado um par");
        }
    }
}
