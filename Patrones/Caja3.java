package Patrones;

public class Caja3 <T> {
   protected T obj;

public Caja3(T obj){ this.obj = obj; }

   public T obtener() {
      return obj;
   }

   public String decorar() {
      String s = obj.toString();
      String linea = "*";
      for (int i = 0; i < s.length(); i++)
         linea += "*";
      linea += "*";
      return linea + "\n*" + s + "*\n" + linea;
   }
   
   public static void main(String[] args) {
      Caja3<String> caja = new Caja3<String>("Pedro P´aramo");
      System.out.println(caja.decorar());
      char c = caja.obtener().charAt(2);
      System.out.println(c);
      Caja3<Double> caja2 = new Caja3<Double>(20.34);
      System.out.println(caja2.decorar());
      double y = caja2.obtener() + 20.0;
      System.out.println(y);
   }
}
