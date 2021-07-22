public class bucles {
   public static void main(String[] args) {
      //Ciclo while
      cicloWhile();
      suma(5);
   }
   //ciclo While
   public static void cicloWhile() {
      int i = 0;
      while (i <= 6) {
         System.out.println(i);
         i++;
      }
   }
   //ciclo for
   public static int suma(int n) {
      int s = 0;
      for (int i = 0; i <= n; i++) {
         System.out.println(i);
         s = s+i;
      }
      return s;
   }
}