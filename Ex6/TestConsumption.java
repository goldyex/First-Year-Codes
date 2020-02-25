/**
 * Tests the program and create objects of type sportcar
 *
 * @Idan 
 * 

public class TestConsumption
{
   
      public static void main(String args[])
    {
        // Main method
        double FuelConsumption=0; 
        
        
        SportCar Car1 = new SportCar(200,1500,220);
        SportCar Car2 = new SportCar(100,1000,170);
        SportCar Car3 = new SportCar(135,1100.2,173);
        Vehicle van = new Van(100, 3500, 160.4);
        
        //set information for each car
        
        //car 1
        FuelConsumption= CalculateFuel(Car1.getHP(), Car1.getWeight(), Car1.getAerodynamics(), Car1.getTopSpeed()); 
        System.out.println("The Fuel Consumption of car 1 is "+ FuelConsumption);
        System.out.println("The acceleration is: " + Car1.acceleration());
        System.out.println("");
        
        
        //car 2
        FuelConsumption= CalculateFuel(Car2.getHP(), Car2.getWeight(), Car2.getAerodynamics(), Car2.getTopSpeed()); 
        System.out.println("The Fuel Consumption of car 2 is "+ FuelConsumption);
        System.out.println("The acceleration is: " + Car2.acceleration());
        System.out.println("");
        
        
        //car 3
        FuelConsumption= CalculateFuel(Car3.getHP(), Car3.getWeight(), Car3.getAerodynamics(), Car3.getTopSpeed()); 
        System.out.println("The Fuel Consumption of car 3 is "+ FuelConsumption);
        System.out.println("The acceleration is: " + Car3.acceleration());
        System.out.println("");
        
        //Van
        
        //FuelConsumption= CalculateFuel(van.getHP(), van.getWeight(), van.getAerodynamics(), van.getTopSpeed()); 
        //System.out.println("The Fuel Consumption of VAN is "+ FuelConsumption);
        System.out.println("The aero of Van is: " + van.getAerodynamics());
        System.out.println("The acceleration of Van is: " + van.acceleration());
    }
    
    public static double CalculateFuel(double horsepower, double weight, double aerodynamics, double topspeed){
    double ConsumptionCalculate= (1000+(weight/5))*(topspeed/100)*(aerodynamics*horsepower)/10000;
    //Now to round the value to 2 decimal places
    ConsumptionCalculate = Math.round(ConsumptionCalculate * 100.0) / 100.0;
    return ConsumptionCalculate;
    }
}
 */