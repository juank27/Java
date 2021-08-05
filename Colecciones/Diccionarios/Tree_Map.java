package Colecciones.Diccionarios;

import java.util.Map;
import java.util.TreeMap;
public class Tree_Map {
   public static void main(String args[]) {
      // Creaci´on del TreeMap
      TreeMap<Integer, String> mapa = new TreeMap<Integer, String>();
      // Agregar elementos
      mapa.put(3, "MisionTIC");
      mapa.put(2, "estudiantes");
      mapa.put(1, "hola");
      for (Map.Entry<Integer,String> pareja : mapa.entrySet()) {
         int clave = (int) pareja.getKey();
         String valor = (String) pareja.getValue();
         System.out.println(clave + " : " + valor);
      }
   }
}
