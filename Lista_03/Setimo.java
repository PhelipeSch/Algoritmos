import java.util.Scanner;
public class Setimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner ( System.in);
        
        System.out.print("Digite o valor maximo suportado pelo caminhao: ");
        double max = leitor.nextDouble();
        
        System.out.print("Digite o peso de sua carga: ");
        double carga = leitor.nextDouble();
        
        double soma = 0;
        
        while(carga != 0 && soma + carga <= max){
                
            soma += carga;
            System.out.print("Digite o proximo valor: ");
            carga = leitor.nextDouble();
        }
        System.out.print("O valor total eh de: " + soma);
        

    }
    
}
