package Colecciones.Diccionarios;

import java.util.HashMap;
import java.util.Map;
public class Hash_Map {
   public static void main(String[] args) {
      //HashMap con las claves string y valores double
      HashMap<String, Double> mapa = new HashMap<>();

      //agregando elementos al HashMap
      mapa.put("Nota1", 3.2);
      mapa.put("Nota2", 4.3);
      mapa.put("Nota3", 3.9);

      //Cantidad de elementos al HashMap
      System.out.println("Tamaño: " + mapa.size());
      //impresion del HashMap
      System.out.println("HashMap 1: " + mapa);

      //verificacion de llave y extraccion de valor
      if (mapa.containsKey("Nota2")) {
         Double valor =  mapa.get("Nota2");
         System.out.println("Nota 2 === " + valor);
      }

      //remover clave Nota1
      mapa.remove("Nota1");
      System.out.println("HashMapFinal:");
      //recorre HashMap por llave y clave
      for(Map.Entry<String,Double> elem : mapa.entrySet()){
         System.out.println(elem.getKey() + " : " + elem.getValue());
      }
   }
}