/**
 * Largest Class, contain basic info about vehicles 
 *
 * @Idan
 * 
 */
public class Vehicle
{
    // instance variables 
    private double horsepower;
    private double aerodynamics;
    private double weight;
    private double acceleration;
    
    /**
     * Constructor for objects of class Vehicle
     */
    public Vehicle(double Horsepower, double Aerodynamics, double Weight)
    {
        // initialise instance variables
        horsepower = Horsepower;
        aerodynamics =Aerodynamics;
        weight =Weight;
    }

    //class method
    public double acceleration(){
    double Acc = (100/horsepower)*(aerodynamics)*weight/100;
    Acc = Math.round(Acc * 100.0) / 100.0;
    return Acc; 
    }


    //getters
    
    public double getHP()
    {
        //gets value of Horsepower
        return horsepower;
    }
    
     public double getAerodynamics()
    {
        //gets value of aerodynamics 
        return aerodynamics;
    }
    
    
    public double getWeight()
    {
        //gets value of weight 
        return weight;
    }
    
    
}