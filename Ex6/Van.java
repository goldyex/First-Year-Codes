/**
 * Subclass of Vehicle
 *
 * @Idan
 * @
 */
public class Van extends Vehicle
{
    // instance variables 
    private double CarryWeight;
    private double TopSpeed;
    /**
     * Constructor for objects of class Van
     */
    public Van(double Horsepower, double Weight, double CW)
    {
        // initialise instance variables
        super(Horsepower,0.9, Weight);
        CarryWeight = CW;
        TopSpeed= 100;
    }
 
    //overiding method acceleration
    /*(100/horsepower)*(aerodynamics/2)*weight/100;
    Acc = Math.round(Acc * 100.0) / 100.0;*/
    
    public double acceleration(){
    double Acc = super.acceleration();
    Acc = Acc/2;
    return Acc; 
    }


    public double getCarryingWeight()
    {
        return CarryWeight;
    }
    
    public double getVanSpeed()
    {
        return TopSpeed;
    }
} //end class van