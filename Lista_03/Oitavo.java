public class Oitavo {
    public static void main(String[] args) {
        
      int Astolfo = 150;
      int Basileu = 130;
      int contador = 0;
      
      while(Astolfo > Basileu){
          Astolfo += 3;
          Basileu +=5;
          contador++;
      }
      System.out.println("Em "+ contador + " anos Basileu alcancara Astolfo");
      System.out.println("Astolfo tera "+ Astolfo +"cm");
      System.out.println("Basileu tera "+ Basileu +"cm");
    }
}
