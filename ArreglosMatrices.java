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
   //Matrices
   public static int matrices_Metodos() {
      //char [][] C= new char[10][20]; // matriz de 10x20 caracteres
      // int[][] A = new int[5][4]; // matriz de 5x4 enteros
      //double[][] v = new double[6][6]; // matriz de 6x6 reales
      //boolean[][] b = new boolean[2][3]; // matriz de 2x3 booleanos
      int n = 5;
      return n;
   }
   public static int[][] cuadrados_matriz(int[][] X) {
      int[][] Y = new int[X.length][X[0].length];
      for (int i = 0; i < X.length; i++) {
         for (int j = 0; j < X[i].length; j++) {
            Y[i][j] = X[i][j] * X[i][j];
         }
      }
      return Y;
   }
   public static boolean matriz_simetrica(char[][] X) {
      boolean bandera = true;
      for (int i = 0; i < X.length - 1; i++) {
         for (int j = i + 1; j < X.length; j++) {
            bandera &= (X[i][j] == X[j][i]);
         }
      }
      return bandera;
   }
}
