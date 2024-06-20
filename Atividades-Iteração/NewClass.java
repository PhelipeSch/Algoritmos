import java.util.Scanner;
public class NewClass {
    public static void main(String[] args){
        Scanner leitor = new Scanner( System.in);
        
        for( int pri=1;  pri<=10; pri++){
            int tri = leitor.nextInt();
            System.out.println(tri*3);
        }
    }
    
}
