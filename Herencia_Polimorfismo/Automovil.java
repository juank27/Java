package Herencia_Polimorfismo;

public class Automovil extends Vehiculo {
   //Constructor para la clae padre
   public Automovil(int pasajeros, double velocidad) {
      super(pasajeros, velocidad);//envia los valores a la clase padre
   }
   @Override
   public void pintar(int posicion) {
      espacios(posicion+4);
      System.out.println("_ _ _ _ _");
      espacios(posicion+1);
      System.out.println("_ _/_ _|_ _\\\\_ _ _ _");
      espacios(posicion);
      System.out.println("|_   _ _ _ _ _   _ _|");
      espacios(posicion);
      System.out.println("    O         O");
   }
}
