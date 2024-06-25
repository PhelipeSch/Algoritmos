import java.util.Scanner;
public class LaçoFor_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite quantos alunos existem na turma: ");
        int alunos = leitor.nextInt();
        
        int contador = 0;
        double soma = 0;
        
        for(int i=0; i<alunos; i++){
            contador++;
            System.out.print("Digite a nota do aluno " + contador + ": ");
            double nota = leitor.nextDouble();
            soma = soma + nota;
        }
        double media = soma/contador;
        System.out.println("A media da turma foi: " + media);
    }
    
}
/*
Escreva um programa que pergunte ao usuário quantos alunos tem na sala dele.
Em seguida, através de um laço for, pede ao usuário para que entre com as notas de todos os alunos da sala, um por vez.

Por fim, o programa mostra a média, aritmética, da turma.
*/