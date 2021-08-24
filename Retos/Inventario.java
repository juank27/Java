package Retos;

import java.util.ArrayList;

public class Inventario {
   
   public static void main(String[] args) {
      ArrayList<String> n = new ArrayList<>();
      ArrayList<String> s = new ArrayList<>();
      n.add("e");
      n.add("e");
      n.add("h");
      n.add("J");
      n.add("Y");
      n.add("Y");
      s = consultarAlimentos(n);
      for (int i = 0; i < s.size(); i++) {
         System.out.println(s.get(i));
      }
   }
      //Retorna lista sin elementos repetidos
   public static ArrayList<String> consultarAlimentos(ArrayList<String> nombres) {
      ArrayList<String> ordenado = new ArrayList<>();
      ordenado.add(nombres.get(0));
      for (int i = 1; i < nombres.size(); i++) {
         String inventario = nombres.get(i);
         if (ordenado.contains(inventario) != true) {
            ordenado.add(inventario);
            //System.out.println(inventario);
         }
      }
      return ordenado;
   }
}
