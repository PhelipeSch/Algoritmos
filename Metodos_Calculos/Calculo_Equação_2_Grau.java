public class Calculo_Equação_2_Grau {
     public static double[] calculoRaizes(int a, int b, int c) {
        double delta = b * b - 4 * a * c;

        if (delta < 0) {
            return null;
        }
        
        else if (delta == 0) {
            double[] umaRaiz = new double[1];
            umaRaiz[0] = -b / (2.0 * a);
            return umaRaiz;
        }
        
        else {
            double[] raizes = new double[2];
            raizes[0] = (-b + Math.sqrt(delta)) / (2 * a);
            raizes[1] = (-b - Math.sqrt(delta)) / (2 * a);
            return raizes;
        }
    }
}