package Patrones;

public class Pareja<K, V> {
   protected K clave;
   protected V valor;

   public Pareja(K clave, V valor) {
      this.clave = clave;
      this.valor = valor;
   }

   public K clave() {
      return clave;
   }

   public V valor() {
      return valor;
   }

   public String toString() {
      return "(" + clave + "," + valor + ")";
   }
   public static void main(String[] args) {
      Pareja<Integer, String> pareja = new Pareja<Integer, String>(20, "Pedro P´aramo");
      System.out.println(pareja);
      Integer c = pareja.clave() + 10;
      System.out.println(c);
      System.out.println(pareja.valor().charAt(2));
   }
}
