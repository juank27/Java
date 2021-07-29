package Herencia_Polimorfismo;

public class Carrera {
   public static void pausar() {
      try {
         Thread.sleep(100);
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }
   public static void main(String[] args) {
      Automovil automovil = new Automovil(5, 1);
      automovil.pintar(0);
   }
}
