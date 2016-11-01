

package fuelefficiency;

/**
 *
 * @author behac6513
 */
public class HybridCar extends Vehicle  {

    /**
     *
     */
    public HybridCar(){
        FE = 3.8;
    }
    @Override
    public double getDistance(double d){
        double a = d/FE*dist;
        return(a);
    }
}
