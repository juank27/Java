package concesionario.vehiculo;

import java.util.ArrayList;

/**
 * Class representing a small car 
 * @author jgomez
 *
 */
public class Concesionario{

    //private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    
    /**
     * Crea un concesionario con un nombre dado
     * @param nombre Nombre del concesionario
     */
    public Concesionario(String nombre) {
	//this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }
    
    /**
     * Agrega un vehiculo al concesionario
     * @param v 
     */
    public void agregarVehiculo(Vehiculo v){
        vehiculos.add(v);
    }
    
    
    public int contarTotalVehiculos(){
        return vehiculos.size();
    }
    
    
    /**
     * 
     */
    public int contarCarga(int cap){
        int total = 0;
        for (Vehiculo v:vehiculos){
            if (v instanceof Carga)
                if ((((Carga) v).capacidad)>=cap)
                total += 1;
        }
        return total;    
    }
    
    
    /**
     * 
     * @return 
     */
    public int contarParticulares(){
        int total = 0;
        for (Vehiculo v:vehiculos){
            if (v instanceof Particular)
            {
                total += 1;        
            }
        }   
        return total;    
    }
    
    public int contarParticulares(String clr){
        int total = 0;
        for (Vehiculo v:vehiculos){
            if (v instanceof Particular)
            {
                if (((Particular) v).color.equalsIgnoreCase(clr))
                    total += 1;        
            }
        }   
        return total;    
    }
    
}