import java.util.Scanner;
public class Nono {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int media =0;
        
        for(int i=1; i<=10; i++){
            int idade = leitor.nextInt();
            if(idade<18){
                System.out.println("Menor de idade");
            }else{
                System.out.println("Maior de idade");
            }
            media += idade;
        }
        media /= 10;
        System.out.println("Media = "+media);
    }
    /*
    Escreva um programa que leia a idade de 10 pessoas e mostre “menor de idade” para quem tiver menos de 18 anos
    e “maior de idade para os demais”. Ele deve também calcular e mostrar a média da idade das 10 pessoas. Faça 3
    versões do programa, utilizando as estruturas de repetição estudadas: “while”, “do...while” e “for”.
    */
    
}
