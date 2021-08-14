
package vehiculo;

/**
 * Class representing a cargo car 
 * @author jgomez
 *
 */
public class Carga extends Vehiculo{
    /**
     * Load capability
     */
    protected int capacidad;

    /**
     * Creates a carrying vehicle with the given number of passengers, speed and load capability
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     * @param peso Load capability
     */
   public Carga(int pasajeros, double velocidad, int peso) {
	super(pasajeros, velocidad);
	this.capacidad = peso>5?5:peso;
    }

  
}