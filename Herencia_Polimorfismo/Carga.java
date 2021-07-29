package Herencia_Polimorfismo;

public class Carga extends Vehiculo{
   protected int capacidad;
   protected  Object carga;
   public Carga(int pasajeros, double velocidad, int peso){
      super(pasajeros, velocidad);
      this.capacidad = peso>5?5:peso;
      this.carga = "___";
   }
   @Override
   public void pintar(int posicion){}
   public boolean llevar(int p) {
      int k = 1;
      for (int i = 0; i < this.capacidad; i++) {
         k *=10;
      }
      if (p < k) {
         this.carga = p;
         return true;
      }else{
         return false;
      }
   }
   public boolean llevar(String p){
      if (p.length() <= this.capacidad) {
         this.carga = p;
         return true;
      }else{
         return false;
      }
   }
}
