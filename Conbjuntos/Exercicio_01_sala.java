import java.util.Set; // Interface
import java.util.HashSet; // Classe //Mais rápido e SDS a ordem
import java.util.LinkedHashSet; // Classe // Guarda a ordem de inserção
import java.util.TreeSet; // Classe // Guarda em ordem alfabética 
public class Exercicio_01_sala {
    public static void main(String[] args) {
        
        Set<String> TG = new HashSet();
        TG.add("Fabiana");
        TG.add("Debora Lima");
        TG.add("Fernanda");
        
        Set<String> TR = new LinkedHashSet();
        TR.add("Raquel Martins");
        TR.add("Raquel Cristina");
        TR.add("Marta");
        
        Set<String> GE = new HashSet();
        GE.add("Fernanda");
        GE.add("Fabiana");
        
        Set<String> JF = new TreeSet();
        JF.add("Debora Lima");
        JF.add("Adriana");
        JF.add("Raquel Martins");
        JF.add("Debora Magaldi");
        
        //Dados que serão utilizados nas operacoes de conjuntos
        Set<String> GEuJF = new HashSet(); // Ge uniao JF
        Set<String> JFiTR = new HashSet(); // JF uniao TR
        boolean GEcTG; // Ge esta contido em TR?
        Set<String> TG_GE = new HashSet(); // TG diferenca GE
        Set<String> TGdsJF = new HashSet(); // TG diferenca simetria JF
        
        // OPERACAO DE UNIAO DE DOIS CONJUNTOS
        System.out.println("");
        System.out.println("UNIAO DE CONJUNTOS");
        GEuJF.addAll(GE);
        GEuJF.addAll(JF);
        for(String elemento : GEuJF){
            System.out.println(elemento);
        }
        
        // OPERACAO DE INTERSECCAO DE DOIS CONJUNTOS
        System.out.println("");
        System.out.println("INTERSECCAO DE CONJUNTOS");
        JFiTR.addAll(JF);
        JFiTR.retainAll(TR);// Deixa apenas os elementos que já existem no novo
        for(String elemento : JFiTR){
            System.out.println(elemento);
        }
        
        // OPERACAO DE "ESTA CONTIDO?" DE DOIS CONJUNTOS
        System.out.println("");
        System.out.println("ESTA CONTIDO DE CONJUNTOS");
        GEcTG = TG.containsAll(GE);
        System.out.println(GEcTG);
        
        // OPERACAO DE DIFERENCA DE DOIS CONJUNTOS
        System.out.println("");
        System.out.println("DIFERENCA DE CONJUNTOS");
        TG_GE.addAll(TG);
        //Conjunto temporario para guardar a interseccao
        Set<String>temp= new HashSet();
        temp.addAll(TG);
        temp.retainAll(GE);//Deixa apenas os elementos que ja existem no novo
        TG_GE.removeAll(temp);
        
        for(String elemento : TG_GE){
            System.out.println(elemento);
        }
        System.out.println("");
        System.out.println("DIFERENCA SIMETRICA DE CONJUNTOS");
        TGdsJF.addAll(TG);
        TGdsJF.addAll(JF);
        //Conjunto temporario para guardar a interseccao
        Set<String>tempo = new HashSet();
        
        tempo.addAll(TG);
        tempo.retainAll(JF);//Deixa apenas os elementos que já existem no novo
        
        TGdsJF.removeAll(tempo);
        
        for(String elemento : TGdsJF){
            System.out.println(elemento);
        }
    }
}
