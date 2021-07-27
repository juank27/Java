package Clases_Objetos;

public class Perro {
   //Metodo principal
   public static void main(String[] args) {
      Perro miPerro = new Perro(5,"Toby", "Azul");
      miPerro.saludar();
      //multiples objetos
      Perro miPerro1 = new Perro(5, "Toby", "Azul");
      Perro miPerro2 = new Perro(7, "Vainilla", "Negro");
      
      miPerro1.ladrar();
      miPerro2.saludar();
      //que perro es mayor
      miPerro1.quienEsMayor(miPerro2);
      //Saludar otro perro
      miPerro1.saludarOtroPerro(miPerro2);
   }
   //Atributos
   public int edad;
   public String nombre;
   public String colorOjos;
   //Constructor 
   Perro(int edad, String nombre, String coloOjos){
      this.edad = edad;
      this.nombre = nombre;
      this.colorOjos = coloOjos;
   }
   //Metodos
   public void ladrar(){
      System.out.println("Guau guau");
   }
   public void saludar() {
      System.out.println("Hola, mi nombre es " + nombre);
   }
   //comparar edad de dos perros
   public void quienEsMayor(Perro otroPerrro){
      if (this.edad > otroPerrro.edad) {
         System.out.println("Soy mayor que " + otroPerrro.nombre);
      }else if (this.edad == otroPerrro.edad) {
         System.out.println("Tenemos la misma edad");
      }else{
         System.out.println(otroPerrro.nombre + " es mayor que yo");
      }
   }
   //Saludar a otro perro
   public void saludarOtroPerro(Perro otroPerro) {
      System.out.println("Hola " + otroPerro.nombre + ", yo soy " + this.nombre);
   }
}
