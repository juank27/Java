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
}
