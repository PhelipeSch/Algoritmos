import java.util.Scanner;
public class SwitchCaseIf {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        
        System.out.print("Digite o ano de nasciento: ");
        int anoNasc = leitor.nextInt();
        
        if( (anoNasc == 2007 || anoNasc == 2008) || anoNasc == 2009) {
            System.out.println("Categoria Juvenil");
        } else {
            if( anoNasc == 2010 || anoNasc == 2011 || anoNasc == 2012) {
                System.out.println("Categoria SUB-15");
            } else{
                if(anoNasc ==2013 || anoNasc == 2014) {
                    System.out.println("Categoria SUB-12");
                } else {
                    System.out.println("Inscricao invalida!!!");
                }
            }
        }
    }
    
}
