
package concesionario.vehiculo;

/**
 * Abstract Class representing a Vehicle
 * @author jgomez
 *
 */
public class Vehiculo {
    /**
     * Speed of the Vehicle
     */
    public double velocidad;
    /**
     * Number of passengers 
     */
    public int pasajeros;
    
    /**
     * Creates a vehicle with the given number of passengers and speed
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     */
    protected Vehiculo(int pasajeros, double velocidad) {
	this.velocidad = velocidad;
	this.pasajeros = pasajeros;
    }
    
}