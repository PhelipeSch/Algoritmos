public class Primeiro {
    public static void main(String[] args) {
        
        double a = Math.pow(9.0, 3.0);
        System.out.println("A) " + a);
        
        double b = Math.pow(7.0, 5.0);
        System.out.println("B) " + b);
        
        double c1 = Math.pow(3.0, 9.0);
        double c2 = Math.pow(2.0, 10.0);
        double ResultadoC = c1+c2;
        System.out.println("C) " + ResultadoC);
        
        double d1 = Math.pow(5.0, 4.0);
        double d2 = Math.pow(6.0, 2.0);
        double ResultadoD = d1-d2;
        System.out.println("D) " + ResultadoD);
        
        double e1 = Math.pow(5.0, 2.0);
        double ResultadoE = Math.pow(e1, 3.0);
        System.out.println("E) " + ResultadoE);
        
        double f1 = Math.pow(2.0, 7.0);
        double f2 = Math.pow(3.0, 4.0);
        double f3 = f1-f2;
        double ResultadoF = Math.cbrt(f3);
        System.out.println("F) " + ResultadoF);
        
        double g1 = Math.pow(9.0, 7.0);
        double g2 = Math.pow(4.0, 3.0);
        double g3 = g1*g2;
        double ResultadoG = Math.pow(g3, 1.0/5);
        System.out.println("G) " + ResultadoG);
        
        double h1 = Math.pow(2.0, 5.0);
        double h2 = Math.pow(5.0, 5.0);
        double h3 = h1/h2;
        double ResultadoH = Math.pow(h3, 1.0/4);
        System.out.println("H) " + ResultadoH);
    }    
}