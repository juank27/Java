package concesionario.vehiculo;

/**
 * Class representing a SUV
 * @author jgomez
 *
 */
public class Particular extends Vehiculo{

    public String color;
    /**
     * Creates a SUV vehicle with the given number of passengers and speed
     * @param pasajeros Number of passengers
     * @param velocidad Speed of the Vehicle
     */
    public Particular(int pasajeros, double velocidad, String color) {
	super(pasajeros, velocidad);
        this.color = color;
    }


}