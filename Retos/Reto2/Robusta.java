package Retos.Reto2;

public class Robusta extends Cafe{
   public double cantidad;

   public Robusta(int consecutivo, double valor, boolean molido,
                     double cantidad){
      super(consecutivo,valor,molido);
      this.cantidad = cantidad;
   }
}
