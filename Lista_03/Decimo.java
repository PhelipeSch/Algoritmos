import java.util.Scanner;
public class Decimo {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        double AdultoG = 0, AdultoI = 0;
        double CriancaG = 0, CriancaI =0;
        
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
        
        double totalCri = CriancaG+CriancaI;
        double totalA = AdultoG+AdultoI;
        double totalG = CriancaG+AdultoG;
        double totalI = CriancaI+CriancaG;
        double total = totalCri+totalA;
        double percentualA = (totalA  * 100 /  (double) total) ;
        double percentualCri = (totalCri * 100/ (double) total) ;
        double percentualG = (totalG * 100/ (double) total) ;
        double percentualI = (totalI * 100/ (double) total) ;
        double percentualAG = (AdultoG * 100/ (double) totalA) ;
        double percentualAI = (AdultoI * 100/ (double) totalA) ;
        double percentualCriG= (CriancaG * 100/ (double) totalCri) ;
        double percentualCriI = (CriancaI * 100/ (double) totalI) ;
        
        System.out.println("Total de Criancas: " + totalCri);
        System.out.println();
        System.out.println("Total de Adultos: " + totalA);
        System.out.println();
        System.out.println("Total de Gremistas: " + totalG);
        System.out.println();
        System.out.println("Total de Colorados: " + totalI);
        System.out.println();
        System.out.println("Total de Pessoas: " + total);
        System.out.println();
        System.out.println("Percentual de adultos: " + percentualA);
        System.out.println();
        System.out.println("Percentual de criancas: " + percentualCri);
        System.out.println();
        System.out.println("Percentual de gremistas: " + percentualG);
        System.out.println();
        System.out.println("Percentual de colorados: " + percentualI);
        System.out.println();
        System.out.println("Percentual de adultos gremistas: " + percentualAG);
        System.out.println();
        System.out.println("Percentual de adultos colorados: " + percentualAI);
        System.out.println();
        System.out.println("Percentual de criancas gremistas: " + percentualCriG);
        System.out.println();
        System.out.println("Percentual de criancas coloradas: " + percentualCriI);
    }
}
