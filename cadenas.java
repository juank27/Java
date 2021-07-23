public class cadenas{
   public static void main(String[] args) {
      //comparaCadenas();
      separCadenas();
   }
   //Comparar cadenas con equals
   public static void comparaCadenas() {
      String a = "hola";
      String b = "hola";
      String c = "HOLA";
      System.out.println(a.equals(b));
      System.out.println(a.equals(c));
      System.out.println(a.equalsIgnoreCase(c)); //ignora si es mayuscula o minuscula
   }
   //Un texto contiene otro 
   public static void contener() {
      String a = "hola Jorge";
      String b = "hola";
      System.out.println(b.contains(a));
   }
   //longitud de una cadena de texti
   public static void longitud() {
      System.out.println("Hola Mundo".length());
   }
   //subcadenas
   public static void subcadena() {
      String a = "Hola mundo";
      a.substring(0, 4); 
   }
   //partir cadenas
   public static void separCadenas() {
      String a = "Hola mundo";
      String []separado = a.split(" ");
      for (String n : separado) {
         System.out.println(n);
      }
   }
}