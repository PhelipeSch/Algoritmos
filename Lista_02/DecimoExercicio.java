import java.util.Scanner;
public class DecimoExercicio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("Digite um valor para a classe [1]- Ave, [2]- Mamifero e [3]- Reptil");
        int classe = leitor.nextInt();
        
        System.out.println("Digite um valor para a alimentacao [1]- Herbivoro e [2]- Carnivoro");
        int alimentacao = leitor.nextInt();
        
        
        switch(classe){
            case 1:
                if(alimentacao == 1){
                    System.out.println("O seu animal eh! Papagaio");
                    break;
                }if(alimentacao == 2){
                    System.out.println("O seu animal eh! Aguia");
                    break;
                } else{
                    System.out.println("Nao consegui entender");
                    break;
                }
            case 2:
                 if(alimentacao == 1) {
                        System.out.println("O seu animal eh! Vaca");
                        break;
                    }
                    if(alimentacao == 2) {
                        System.out.println("O seu animal eh! Leao");
                        break;
                    } 
                    
                    else {
                        System.out.println("Nao consegui entender");
                        break;
                    }
            case 3:
                    if(alimentacao == 1) {
                        System.out.println("O seu animal eh! Tartaruga");
                        break;
                    }
                    if(alimentacao == 2) {
                        System.out.println("O seu animal eh! Cobra");
                        break;
                    } 
                    
                    else {
                        System.out.println("Nao consegui entender");
                        break;
                    }
            default:
                System.out.println("Não consegui entender o que voce digitou.");
                break;
                
        }
    }
    
}
