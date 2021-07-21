import java.util.Scanner;
public class HolaMundo{
   public static void main(String[] args) 
   {
      System.out.println("Hola mundo");
      Scanner sc = new Scanner(System.in);
      double d = sc.nextDouble();
      System.out.println(f(d));
   }

   public static double f(double x) 
   {
      return x * x;
   }
}