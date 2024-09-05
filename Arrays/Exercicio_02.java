public class Exercicio_02 {
    public static void main(String[] args) {
        /*Criação automática de Array
        
        int[] valores = {17, 34, -23, 117, -7};
        */

        /*Criação manual
        
        int[] valores = new int [5];
        
        valores[0] = 17;
        valores[1] = 34;
        valores[2] = -23;
        valores[3] = 117;
        valores[4] = -7;
        
        //Exibição dos valores dos Arrays
        for(int i = 0; i< valores.length; i++){
            System.out.println(i + ": " + valores[i]);
        }
        */
        /*Criação manual de Arrays de duas dimenções
        double [][] notas = new double[4][2];
        notas [0][0] = 10.0;
        notas [0][1] = 9.0;
        notas [1][0] = 9.0;
        notas [1][1] = 9.0;
        notas [2][0] = 0.0;
        notas [2][1] = 8.0;
        notas [3][0] = 7.6;
        notas [3][1] = 8.2;
        */
        //Criação automática de Arrays de duas dimenções
        double[][] notas = 
        {{10.0, 9.0},{9.0, 9.0},{0.0, 8.0},{7.6, 8.2},};
        
        for(int i = 0; i < notas.length; i++){
            for( int j = 0; i < notas[1].length; j++){
                System.out.println(i+", "+j+": "+ notas[i][j]);
            }
        }
    }
}
