import java.util.Scanner;
public class HolaMundo{
   public static void main(String[] args) 
   {
      System.out.println("Hola mundo");
      Scanner sc = new Scanner(System.in);
      double d = sc.nextDouble();
      System.out.println(f(d));
      sc.close();
   }
      //n a la n
   public static double f(double x) 
   {
      return x * x;
   }
      //area Rectangulo
   public static double area_rectangulo(double l, double a) {
      return l * a;
   }
}