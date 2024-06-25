import java.util.Scanner;
public class If_Else_10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.println("Digite seu peso em quilos: ");
        double peso = leitor.nextDouble();
        
        System.out.println("Digite sua altura em metros: ");
        double altura = leitor.nextDouble();
        
        double imc = peso/(altura*altura);
        
        if(imc < 17){
            System.out.println("Muito abaixo do peso: " + imc);
        }else{
            if(imc >= 17 && imc < 18.49){
                System.out.println("Abaixo do peso: " + imc);
            }else{
                if(imc >= 18.50 && imc < 24.99){
                    System.out.println("Peso Ideal: " + imc);
                }else{
                    if(imc >= 25 && imc < 29.99){
                        System.out.println("Acima do peso: " + imc);
                    }else{
                        if(imc >= 30 && imc < 34.99){
                            System.out.println("Obesidade nivel I: " + imc);
                        }if(imc >= 35 && imc < 39.99){
                            System.out.println("Obesidade nivel II: " + imc);
                        }else{
                            if(imc >= 40){
                                System.out.println("Obesidade nivel III: " + imc);
                            }
                        }
                    }
                }
            }
        }
    }
}
