/**
 * Subclass of Vehicle
 *
 * @Idan
 * @
 */
public class SportCar extends Vehicle
{
    // instance variables 
    private double TopSpeed;
    /**
     * Constructor for objects of class SportCar
     */
    public SportCar(double Horsepower, double Weight, double TS)
    {
        // initialise instance variables
        super(Horsepower,0.5, Weight);
        TopSpeed = TS;
    }


    public double getTopSpeed()
    {
        return TopSpeed;
    }
} //end class SportCar