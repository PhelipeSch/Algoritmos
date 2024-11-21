import java.util.ArrayList;
import java.util.TreeMap;

public class MeusDados {

    TreeMap<String, String> Alunos = new TreeMap();
    TreeMap<String, String> Professores = new TreeMap();
    TreeMap<String, String> Componentes = new TreeMap();
    
    ArrayList<Turma> Turmas = new ArrayList();
    ArrayList<AlunoTurma> AlunosTurmas = new ArrayList();

    class Turma {

        String ano;
        String codigoComponente;
        String matriculaProfessor;

        public Turma(String ano, String comp, String prof) {
            this.ano = ano;
            this.codigoComponente = comp;
            this.matriculaProfessor = prof;
        }
    }

    class AlunoTurma {

        String ano;
        String codigoComponente;
        String matriculaAluno;
        Double nota1;
        Double nota2;
        Double media;

        public AlunoTurma(String ano, String comp, String aluno) {
            this.ano = ano;
            this.codigoComponente = comp;
            this.matriculaAluno = aluno;
        }

        public void addNota(int id, double valor) {
            switch (id) {
                case 1:
                    this.nota1 = valor;
                    break;
                case 2:
                    this.nota2 = valor;
            }
        }
        
        public void calculaMedia() {
            this.media = (nota1 + nota2) / 2;
        }
    }

    public MeusDados() {
        Alunos.put("202401", "Antônia Cardoso");
        Alunos.put("202402", "Eliel Albuquerque");
        Alunos.put("202403", "Juliana David");
        Alunos.put("202404", "Rosana Feliciano");
        Alunos.put("202301", "Clemente Capela");
        Alunos.put("202302", "Firmino Cabral");
        Alunos.put("202303", "Lívia Lopes");
        Alunos.put("202304", "Samanta Gama");
        Alunos.put("202201", "Diana Sala");
        Alunos.put("202202", "Judite Medeiros");
        Alunos.put("202203", "Patrícia Martins");
        Alunos.put("202204", "Valério Rocha");

        Professores.put("15768", "Lúcia Melo");
        Professores.put("13998", "Elias Melo");
        Professores.put("11234", "Dinis Henriques");
        Professores.put("10766", "Hermínia Lázaro");

        Componentes.put("101", "Algoritmos e Lógica de Programação");
        Componentes.put("102", "Desenvolvimento Web 1");
        Componentes.put("103", "Introdução à Informática");
        Componentes.put("201", "Desenvolvimento Web 2");
        Componentes.put("202", "Manutenção e Montagem de Computadores");
        Componentes.put("203", "Banco de Dados");
        Componentes.put("301", "Redes de Computadores");
        Componentes.put("302", "Sistemas de Informação");
        Componentes.put("303", "Programação Avançada");

        Turmas.add(new Turma("2022", "101", "13998"));
        Turmas.add(new Turma("2023", "101", "13998"));
        Turmas.add(new Turma("2024", "101", "13998"));
        Turmas.add(new Turma("2022", "102", "15768"));
        Turmas.add(new Turma("2023", "102", "15768"));
        Turmas.add(new Turma("2024", "102", "15768"));
        Turmas.add(new Turma("2022", "103", "11234"));
        Turmas.add(new Turma("2023", "103", "11234"));
        Turmas.add(new Turma("2024", "103", "11234"));
        Turmas.add(new Turma("2023", "201", "10766"));
        Turmas.add(new Turma("2024", "201", "10766"));
        Turmas.add(new Turma("2023", "202", "13998"));
        Turmas.add(new Turma("2024", "202", "13998"));
        Turmas.add(new Turma("2023", "203", "15768"));
        Turmas.add(new Turma("2024", "203", "15768"));
        Turmas.add(new Turma("2024", "301", "11234"));
        Turmas.add(new Turma("2024", "302", "15768"));
        Turmas.add(new Turma("2024", "303", "10766"));

        AlunosTurmas.add(new AlunoTurma ("2022", "101", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2022", "101", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2022", "101", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2022", "101", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2023", "101", "202301"));
        AlunosTurmas.add(new AlunoTurma ("2023", "101", "202302"));
        AlunosTurmas.add(new AlunoTurma ("2023", "101", "202303"));
        AlunosTurmas.add(new AlunoTurma ("2023", "101", "202304"));
        AlunosTurmas.add(new AlunoTurma ("2024", "101", "202401"));
        AlunosTurmas.add(new AlunoTurma ("2024", "101", "202402"));
        AlunosTurmas.add(new AlunoTurma ("2024", "101", "202403"));
        AlunosTurmas.add(new AlunoTurma ("2024", "101", "202404"));
        AlunosTurmas.add(new AlunoTurma ("2022", "102", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2022", "102", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2022", "102", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2022", "102", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2023", "102", "202301"));
        AlunosTurmas.add(new AlunoTurma ("2023", "102", "202302"));
        AlunosTurmas.add(new AlunoTurma ("2023", "102", "202303"));
        AlunosTurmas.add(new AlunoTurma ("2023", "102", "202304"));
        AlunosTurmas.add(new AlunoTurma ("2024", "102", "202401"));
        AlunosTurmas.add(new AlunoTurma ("2024", "102", "202402"));
        AlunosTurmas.add(new AlunoTurma ("2024", "102", "202403"));
        AlunosTurmas.add(new AlunoTurma ("2024", "102", "202404"));
        AlunosTurmas.add(new AlunoTurma ("2022", "103", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2022", "103", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2022", "103", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2022", "103", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2023", "103", "202301"));
        AlunosTurmas.add(new AlunoTurma ("2023", "103", "202302"));
        AlunosTurmas.add(new AlunoTurma ("2023", "103", "202303"));
        AlunosTurmas.add(new AlunoTurma ("2023", "103", "202304"));
        AlunosTurmas.add(new AlunoTurma ("2024", "103", "202401"));
        AlunosTurmas.add(new AlunoTurma ("2024", "103", "202402"));
        AlunosTurmas.add(new AlunoTurma ("2024", "103", "202403"));
        AlunosTurmas.add(new AlunoTurma ("2024", "103", "202404"));
        AlunosTurmas.add(new AlunoTurma ("2023", "201", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2023", "201", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2023", "201", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2023", "201", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2024", "201", "202301"));
        AlunosTurmas.add(new AlunoTurma ("2024", "201", "202302"));
        AlunosTurmas.add(new AlunoTurma ("2024", "201", "202303"));
        AlunosTurmas.add(new AlunoTurma ("2024", "201", "202304"));
        AlunosTurmas.add(new AlunoTurma ("2023", "202", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2023", "202", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2023", "202", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2023", "202", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2024", "202", "202301"));
        AlunosTurmas.add(new AlunoTurma ("2024", "202", "202302"));
        AlunosTurmas.add(new AlunoTurma ("2024", "202", "202303"));
        AlunosTurmas.add(new AlunoTurma ("2024", "202", "202304"));
        AlunosTurmas.add(new AlunoTurma ("2023", "203", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2023", "203", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2023", "203", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2023", "203", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2024", "203", "202301"));
        AlunosTurmas.add(new AlunoTurma ("2024", "203", "202302"));
        AlunosTurmas.add(new AlunoTurma ("2024", "203", "202303"));
        AlunosTurmas.add(new AlunoTurma ("2024", "203", "202304"));
        AlunosTurmas.add(new AlunoTurma ("2024", "301", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2024", "301", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2024", "301", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2024", "301", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2024", "302", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2024", "302", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2024", "302", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2024", "302", "202204"));
        AlunosTurmas.add(new AlunoTurma ("2024", "303", "202201"));
        AlunosTurmas.add(new AlunoTurma ("2024", "303", "202202"));
        AlunosTurmas.add(new AlunoTurma ("2024", "303", "202203"));
        AlunosTurmas.add(new AlunoTurma ("2024", "303", "202204"));
    }
}
