package Patrones;

public class Caja2 {
   protected Object obj;

   public Caja2(Object obj){ 
      this.obj = obj; 
   }

   public Object obtener() {
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
      Caja2 caja = new Caja2("Pedro Paramo");
      System.out.println(caja.decorar());
      System.out.println(caja.obtener());
      char c = ((String)caja.obtener()).charAt(2);
      System.out.println(c);
   }
}