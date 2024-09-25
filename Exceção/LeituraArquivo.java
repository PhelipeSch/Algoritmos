import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class LeituraArquivo {
    public static void main(String[] args){
        File arquivo = new File("Cursos.txt");
        
        Scanner leitura = null;
        try{
            leitura = new Scanner(arquivo);
        }catch(IOException exc){
            System.err.println("Nao consegui abrir o arquivo");
        }
        
        if(leitura != null){
            while(leitura.hasNext()){
                System.out.println(leitura.nextLine());
            }
            leitura.close();
        }
        
    }
}
