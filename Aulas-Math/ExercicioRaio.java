import java.util.Scanner;

public class ExercicioRaio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Digite o Numero do Raio que deseja as medidas: ");
        
        double Raio=leitor.nextDouble();
        
        
       double perimetro= (Math.PI*2*Raio);
       
       double area= (Math.PI*Math.pow(Raio, 2.0));
       
       double volume = 4/3*Math.PI*Math.pow(Raio, 3.0);
       
       double areaS = 4*Math.PI*Math.pow(Raio, 2.0);
       
       
       
        
        
        
        
        System.out.println("O perimetro eh: " + perimetro);
        System.out.println(" A area eh: " + area);
        System.out.println("O volume eh: " + volume);
        System.out.println("O area superficial eh: " + areaS );
    }
    
}
