import java.util.Scanner;
//A los arreglos tambien debe definirse un tipo de Dato
public class ArreglosMatrices {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      lee_arreglo_enteros(sc, 3);
   }
   //lee un arreglo
   public static int[] lee_arreglo_enteros(Scanner sc, int n) {
      int[] x = new int[n];
      for (int i = 0; i < n; i++) {
         System.out.println("Componente " + i + "-´esima?");
         x[i] = sc.nextInt();
      }
      return x;
   }
   //posicion max de un arreglo
   public static int pos_maximo(int[] A) {
      int m = 0;
      for (int i = 0; i < A.length; i++) {
         if (A[i] > A[m])
            m = i;
      }
      return m;
   }
}
