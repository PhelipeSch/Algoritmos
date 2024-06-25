import java.util.Scanner;
public class If_Else_9 {
    public static void main(String[] args) {
    Scanner leitor = new Scanner (System.in);
    
        System.out.println("Digite o salario do funcionario: ");
        double salario = leitor.nextDouble();
        
        double PercAumento = 0.0;
        double SalarioAumentado = 0.0;
        
        if(salario <= 280){
            PercAumento = (salario/100)*20;
            SalarioAumentado = salario + PercAumento;
            
            System.out.println("O salario antes do reajuste era: " + salario);
            System.out.println("O percentual a ser aumentado eh de: 20%");
            System.out.println("O valor a ser aumento eh: " + PercAumento);
            System.out.println("O novo salario sera de: " + SalarioAumentado);
        }else{
            if(salario > 280 && salario < 700){
                PercAumento = (salario/100)*15;
                SalarioAumentado = salario + PercAumento;
            
                System.out.println("O salario antes do reajuste era: " + salario);
                System.out.println("O percentual a ser aumentado eh de:15%");
                System.out.println("O valor a ser aumento eh: " + PercAumento);
                System.out.println("O novo salario sera de: " + SalarioAumentado);
            }else{
                if(salario >= 700 && salario < 1500){
                    PercAumento = (salario/100)*10;
                    SalarioAumentado = salario + PercAumento;
            
                    System.out.println("O salario antes do reajuste era: " + salario);
                    System.out.println("O percentual a ser aumentado eh de:10%");
                    System.out.println("O valor a ser aumento eh: " + PercAumento);
                    System.out.println("O novo salario sera de: " + SalarioAumentado);
                }else{
                    if(salario >= 1500){
                        PercAumento = (salario/100)*5;
                        SalarioAumentado = salario + PercAumento;

                        System.out.println("O salario antes do reajuste era: " + salario);
                        System.out.println("O percentual a ser aumentado eh de: 5%");
                        System.out.println("O valor a ser aumento eh: " + PercAumento);
                        System.out.println("O novo salario sera de: " + SalarioAumentado);
                    }
                }    
            }
        }
    }  
}