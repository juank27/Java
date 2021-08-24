package Retos;

import java.util.ArrayList;

public class Inventario {
   
   public static void main(String[] args) {
      ArrayList<String> n = new ArrayList<>();
      ArrayList<String> s = new ArrayList<>();
      n.add("avena");
      n.add("arroz");
      n.add("pera");
      n.add("leche");
      n.add("trigo");
      s.add("pera");
      s.add("leche");
      s.add("mango");
      s = cotejarStockTiendas(n, s);
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
      //elementos que hay en la tienda 1 pero no hay en la 2
   public static ArrayList<String> cotejarStockTiendas(ArrayList<String> tienda1, ArrayList<String> tienda2) {
      ArrayList<String> stock = new ArrayList<>();
      for (int i = 0; i < tienda1.size(); i++) {
         if (tienda2.contains(tienda1.get(i)) != true) {
            stock.add(tienda1.get(i));
         }
      }
      return stock;
   }
}
