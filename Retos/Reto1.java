package Retos;

import java.util.Scanner;

public class Reto1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int portland = sc.nextInt();
      sc.close();
      Salida(portland);
   }

   public static void Salida(int portland) {
      Sintomas(Candidatos(portland));
   }

   public static int Candidatos(int portland) {
      int houston = (portland * 2) + 4 ;
      int vegas = (houston + portland) / 5;
      System.out.println(portland + " " + houston + " " + vegas );
      return vegas;
   }

   public static void Sintomas(int vegas) {
      if (vegas <= 20) {
         System.out.println("uno");
      }else if (vegas > 20 && vegas <= 30) {
         System.out.println("dos");
      }else if (vegas > 30 && vegas <= 50) {
         System.out.println("tres");
      }else{
         System.out.println("cuatro");
      }
   }
}