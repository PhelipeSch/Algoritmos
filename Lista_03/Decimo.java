import java.util.Scanner;
public class Decimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int AdultoG = 0, AdultoI = 0;
        int CriancaG = 0, CriancaI =0;
        
        System.out.println("Digite [a] para Adulto [c} para crianca e [x] para parar o algoritmo");
        
        String faixa;
        
        while(!(faixa = leitor.next()).equalsIgnoreCase("X")){
            System.out.println("Digite [g] para gremio e [i] para Internacional");
            String time = leitor.next();
            
            System.out.println("Digite [a] para Adulto [c} para crianca e [x] para parar o algoritmo");
            
            if(faixa.equalsIgnoreCase("A")){
                if(time.equalsIgnoreCase("G")){
                    AdultoG++;
                }else{
                    AdultoI++;
                }
            }else{
                if(time.equalsIgnoreCase("G")){
                    CriancaG++;
                }else{
                    CriancaI++;
                }
            }
        }
        
        int totalCri = CriancaG+CriancaI;
        int totalA = AdultoG+AdultoI;
        int totalG = CriancaG+AdultoG;
        int totalI = CriancaI+CriancaG;
        int total = totalCri+totalA;
        
        System.out.println("Total de Criancas: " + totalCri);
        System.out.println("Total de Adultos: " + totalA);
        System.out.println("Total de Gremistas: " + totalG);
        System.out.println("Total de Colorados: " + totalI);
        System.out.println("Total de Pessoas: " + total);
    }
}
