package Colecciones;

import java.util.Vector;

public class vector_ {
   public static void main(String[] args){
      // Vector para almacenar cualquier tipo
      Vector<Object> vector = new Vector<>();
      // agregar elementos de distinto tipo
      vector.add(1);
      vector.add(true);
      vector.add("Mision");
      vector.add("TIC");
      vector.add(2);
      System.out.println("Vector 1: " + vector);
      // modificar el valor de uno de los elementos
      vector.set(0, 2021);
      System.out.println("Vector 2: " + vector);
      // eliminar elemento en el ´ındice 4
      vector.remove(4);
      System.out.println("Vector 3: " + vector);
      // impresi´on de elementos con ciclo por elemento
      for (Object elemento : vector)
         System.out.print(elemento + " ; ");
   }
}
