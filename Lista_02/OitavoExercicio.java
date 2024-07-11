public class OitavoExercicio {
    public static void main(String[] args) {
        
        int AltAst = 150;
        int AltBas = 130;
        int ano = 2024;
        
        System.out.println("Em 2024 Astolfo tem 150cm de altura e Basileu tem 130cm.");
        
        while(AltAst > AltBas){
            
            ano++;
            AltAst += 3;
            AltBas += 5;
            
            System.out.println("Em " + ano + " Astolfo tera " + AltAst + "cm de altura e Basileu tera " + AltBas + "cm.");
            
        }
    }
}
