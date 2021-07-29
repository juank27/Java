package Herencia_Polimorfismo;

public abstract class Vehiculo {
   protected double velocidad;
   protected int pasajeros;
   public Vehiculo(int pasajeros, double velocidad) {
      this.velocidad = velocidad;
      this.pasajeros = pasajeros;
   }
   public int posicion(int tiempo){
      return (int) (tiempo*velocidad);
   }
   public void espacios(int espacios) {
      for (int i = 0; i < espacios; i++) {
         System.out.println(' ');
      }
   }
   public abstract void pintar(int posicion);   
}