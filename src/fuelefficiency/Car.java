

package fuelefficiency;

/**
 *
 * @author behac6513
 */
public class Car extends Vehicle  {

    /**
     *
     */
    public Car(){
        FE = 9.4;
    }
    @Override
    public double getDistance(double d){
        double a = d/FE*dist;
        return(a);
    }
}
