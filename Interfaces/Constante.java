package Interfaces;
//interfaz que contiene constantes
public interface Constante {
   // Definiendo 3 constantes
   int MIN = 0;
   int MAX = 10;
   String MSJERROR = "LIMITE ERROR";
}

/**
 * multiples interfaces interface Interface1 { 
 *    public void miMetodo(); // m´etodo de interface 
 * } 
 * interface Interface2 { 
 *    public void miOtroMetodo(); // m´etodo de interface 
 * }
 */
/**
 * 
   class DemoClass implements Interface1, Interface2 {
      public void miMetodo() {
         System.out.println("Texto 1 ...");
      }
      public void miOtroMetodo() {
         System.out.println("Texto 2 ...");
      }
   }
 *//**
    * multiples interfaces interface Interface1 { public void miMetodo(); //
    * m´etodo de interface } interface Interface2 { public void miOtroMetodo(); //
    * m´etodo de interface }
    */
/**
 * 
 * class DemoClass implements Interface1, Interface2 { public void miMetodo() {
 * System.out.println("Texto 1 ..."); } 
 * public void miOtroMetodo() {
 * System.out.println("Texto 2 ..."); } }
 */

/**
  * //Una interface puede extender de otra 
   interface A{ 
      void metodo1(); 
      void metodo2(); 
   } //B ahora incluye metodo1() y metodo2() - y a~nade metodo3()
  * interface B extends A{ void metodo3(); }
  * 
  */