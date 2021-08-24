package Retos;

import java.util.ArrayList;

public class Inventario {
   
   public static void main(String[] args) {
      ArrayList<String> n = new ArrayList<>();
      ArrayList<Integer> s = new ArrayList<>();
      n.add("carne");
      n.add("mango");
      n.add("frijol");
      n.add("leche");
      n.add("avena");
      n.add("carne");
      n.add("arroz");
      n.add("frijol");
      n.add("leche");
      n.add("avena");
      String name = "leche";
      s.add(1);
      s.add(3);
      s.add(6);
      s.add(8);
      s = consultarAlimentosParaCambio(s, n, name);
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

      //Alimentos vencidos
   public static ArrayList<Integer> consultarAlimentosParaCambio(ArrayList<Integer> indices, 
            ArrayList<String> alimentoVencido, String alimentoCambio ) {
      ArrayList<Integer> indiceRetorno = new ArrayList<>();     
      for (int i : indices) {
         if (alimentoVencido.get(i) == alimentoCambio) {
            indiceRetorno.add(i);
         }  
      }
      return indiceRetorno;
   }
}
