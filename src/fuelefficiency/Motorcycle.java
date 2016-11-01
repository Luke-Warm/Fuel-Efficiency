

package fuelefficiency;

/**
 *
 * @author behac6513
 */
public class Motorcycle extends Vehicle {
    
    /**
     *
     */
    public Motorcycle(){
        FE = 6.3;
    }
    @Override
    public double getDistance(double d){
        double a = d/FE*dist;
        return(a);
    }
}
