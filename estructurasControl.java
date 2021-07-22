public class estructurasControl {
   public static void main(String[] args) 
   {
      System.out.print(valorAbsoluto(5.0));
   }
      //Condicional Normal
   public static double valorAbsoluto(double x) 
   {
      double valor;
      if (x >= 0) 
      {
         valor = x;
      } else 
      {
         valor = -x;
      }
      return valor;
   }
      //operador Ternario
   public static double valorAbsoluto2(double x) {
      return (x >= 0) ? x : -x;
   }
      //operador logico
   public static boolean condicional(boolean p, boolean q) {
      if (p == true && q == false) {
         return false;
      } else {
         return true;
      }
   }
   public static boolean condicional2(boolean p, boolean q) {
      if (p) {
         return q;
      } else {
         return true;
      }
   }
      //switch
   public static int vocales(char ch){
      int value = 0;
      switch (ch) {
         case 'a':
            value = 1;   
            break;
         case 'b':
            value = 2;
            break;
         default:
            value = 0;
            break;
      }
      return value;
   }
}
