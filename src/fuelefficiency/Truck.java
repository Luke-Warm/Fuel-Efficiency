

package fuelefficiency;

/**
 *
 * @author behac6513
 */
public class Truck extends Vehicle  {

    /**
     *
     */
    public Truck(){
        FE = 14.1;
    }
    @Override
    public double getDistance(double d){
        double a = d/FE*dist;
        return(a);
    }
}
