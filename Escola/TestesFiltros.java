import java.util.ArrayList;
import java.util.stream.Collectors;

public class TestesFiltros {
    
    public static void main(String[] args) {
        
        MeusDados dados = new MeusDados ();
        
        /*
        for( MeusDados.Turma turma: dados.Turmas){
            System.out.println(turma.ano + " " + turma.codigoComponente + " " + turma.matriculaProfessor);
        }
        */
        ArrayList<MeusDados.Turma> filtrado;
        
        filtrado = new ArrayList(
        dados.Turmas.stream().filter( t -> t.matriculaProfessor == "13998").collect(Collectors.toList()) 
        );
        
        for( MeusDados.Turma turma: filtrado){
            System.out.println(turma.ano + " " + turma.codigoComponente + " " + turma.matriculaProfessor);
        }
    }
}
