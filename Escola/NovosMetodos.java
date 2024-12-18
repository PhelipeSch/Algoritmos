public class NovosMetodos {
    
    public static void main(String[] args) {
        MeusDados dados = new MeusDados ();
        
        MeusDados.Turma novaTurma = dados.Turmas.get(0);
        
        System.out.println(novaTurma);
        
        MeusDados.Turma newTurma = dados.Turmas.get(0);
        MeusDados.Turma outraTurma = dados.Turmas.get(1);
        
        System.out.println(newTurma);
        System.out.println(outraTurma);
        
        System.out.println(newTurma.equals(outraTurma));
        System.out.println(newTurma.equals(newTurma));
    }
}
