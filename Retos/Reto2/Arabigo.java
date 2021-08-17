package Retos.Reto2;

public class Arabigo extends Cafe{
   public String origen;
   public String color;

   public Arabigo( int consecutivo, double valor, 
                  boolean molido, String origen, String color){
      super(consecutivo,valor,molido);
      this.origen = origen;
      this.color = color;
   }
}