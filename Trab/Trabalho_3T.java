import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Trabalho_3T {

    private static final List<Task> tarefas = new ArrayList<>(); //List<Task> é um tipo de dado em que permite adicionar objetos Task que representam tarefas, sugestão do ChatGpt
    private static int id = 1; // ID começa em 1 e incrementa automaticamente

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { // Sugestão do ChatGpt
            System.out.println("Gerenciador de Processos");
            System.out.println("Digite os seguintes numeros para fazer as operacoes correspondentes:");
            System.out.println("1. Para adicionar uma tarefa");
            System.out.println("2. Para exibir todas as tarefas");
            System.out.println("3. Para executar uma tarefa");
            System.out.println("4. Sair");
            System.out.println("");

            int escolha = scanner.nextInt();
            scanner.nextLine(); 

            if (escolha == 1) {
                addTarefa(scanner);
            } else {
                if (escolha == 2) {
                    mostra_tarefas();
                } else {
                    if (escolha == 3) {
                        executar(scanner);
                    } else {
                        if (escolha == 4) {
                            break;
                        } else {
                            System.out.println("Opção inválida! Tente novamente.");
                        }
                    }
               }
            }
        }
        scanner.close();
    }

    private static void addTarefa(Scanner scanner) {
        System.out.print("Digite a prioridade da tarefa (0 a 15): ");
        int prioridade  = scanner.nextInt();
        scanner.nextLine(); 

        if (prioridade  < 0 || prioridade  > 15) {
            System.out.println("Prioridade invalida! Deve ser entre 0 e 15.");
            return;
        }

        System.out.print("Digite a descricao da tarefa: ");
        String descricao = scanner.nextLine();

        tarefas.add(new Task(id++, prioridade , descricao));
        System.out.println("");
        System.out.println("Tarefa adicionada corretamente!");
        System.out.println("");
    }

    private static void mostra_tarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa cadastrada.");
            return;
        }
        
        System.out.println("");
        System.out.println("Tarefas cadastradas:");
        System.out.println("");
        tarefas.stream().sorted(Comparator.comparingInt(Task::getprioridade )).forEach(System.out::println); // Parte adaptada do ChatGPT
        System.out.println("");
    }

    private static void executar(Scanner scanner) {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa para executar.");
            return;
        }

        mostra_tarefas();
        System.out.println("");
        System.out.print("Digite o ID da tarefa que esta sendo executada: ");
        int ID_tarefa = scanner.nextInt();
        scanner.nextLine(); 

        boolean removed = tarefas.removeIf(task -> task.getId() == ID_tarefa); //Parte adaptada do ChatGpt

        if (removed) {
            System.out.println("");
            System.out.println("Tarefa com ID " + ID_tarefa + " marcada como executada e removida da lista.");
        } else {
            System.out.println("ID invalido! Tente novamente.");
        }

        mostra_tarefas(); 
    }
}

class Task {

    private final int id;
    private final int prioridade ;
    private final String descricao;

    public Task(int id, int prioridade , String descricao) {
        this.id = id;
        this.prioridade  = prioridade ;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public int getprioridade () {
        return prioridade ;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Prioridade: " + prioridade  + ", Descricao: " + descricao;
    }
}