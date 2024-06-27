public class Sexto {
    public static void main(String[] args) {
        int TamIni = 20;
        int TamAtual = TamIni;
        int TalLago = 5_000_000;
        int contador = 0;
       
        while(TamAtual<TalLago){
            contador += 5;
            TamAtual = TamAtual*2;
            
            System.out.println("");
            System.out.println("Dias= " + contador);
            System.out.println("Tamanho Atual= " + TamAtual);
        }
        
        
    }
    
}
