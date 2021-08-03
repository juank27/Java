package Patrones;

public class Caja {
   public static void main(String[] args) {
      Caja caja = new Caja();
      String s = caja.decorar(10);
      System.out.println(s);
   }
   /**
   //decorador con entero
   public String decorar(int n) {
      String s = "" + n;
      String linea = "*";
      for (int i = 0; i < s.length(); i++) {
         linea += "*";
      }
      linea += "*";
      return linea + "\n*" + s + "*\n" + linea;
   }
   //decorador con double
   public String decorar(double n) {
      String s = "" + n;
      String linea = "*";
      for (int i = 0; i < s.length(); i++) {
         linea += "*";
      }
      linea += "*";
      return linea + "\n*" + s + "*\n" + linea;
   }
    */
   //se elminan los metodos anteriores y se utiliza como paramatro object
   public String decorar(Object obj) {
      String s = obj.toString();
      String linea = "*";
      for (int i = 0; i < s.length(); i++) {
         linea += "*";
      }
      linea += "*";
      return linea + "\n*" + s + "*\n" + linea;
   } 
}
