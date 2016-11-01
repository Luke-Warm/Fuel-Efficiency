

package fuelefficiency;

/**
 *
 * @author behac6513
 */
public abstract class Vehicle {
    //constructors
    
    /**
     * Class constructor
     */
    final int dist = 100;
    double FE;


    public Vehicle(){
        FE = 9.8;
    }
    /**
     * fuel efficiency is already determined
     * dist will always refer to 100km
     * <p>
     * this method only returns when getDistance(); is used
     * and the amount of fuel must be specified
     * (no default)
     * 
     * @param d the amount of fuel
     * @return efficiency of vehicle
     * @see object
     */
    public double getDistance(double d){
        double a = d/FE*dist;
        return(a);
    }
}
