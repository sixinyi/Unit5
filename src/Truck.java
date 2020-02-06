// 2020.2.3 Bruce

public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;

    private static final double CAPACITY = 20;
    private static double totalFuel;

    public Truck(String name){
        truckID = name;
    }

    public Truck(String name, double odo, double m, double fue){
        truckID = name;
        odometer = odo;
        mpg = m;
        fuel = fue;
    }

    public String getTruckID() {return truckID;}
    public double getOdometer() {return odometer;}
    public double getMpg() {return mpg;}
    public double getFuel() {return fuel;}

    //////下面的要改

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    private boolean enoughFuel(double mile){
        double need = mile/mpg;
        if(fuel < need){
            return false;
        }
        else{
            return true;
        }

    }

    public String drive(double mi){
        if(enoughFuel(mi)){
            odometer += mi;
            fuel -= mi/mpg;
            return "success";
        }
        else{
            return "Truck " + truckID + " does not have enough fuel to drive 500.0 miles.";
        }
    }
        /*
        odometer += runMile;
        fuel -= runMile / mpg;
        if(fuel + runMile / mpg < runMile / mpg){
            return "Truck " + truckID + " does not have enough fuel to drive 500.0 miles.";
        }
        else{
            return "success";
        }

         */

    public void fill(){
        totalFuel += (CAPACITY-fuel);
        fuel = 20;
    }

    public String fill(double f){
        if(totalFuel <= 20){
            fuel += f;
            totalFuel += f;
            return "success";
        }else{
            return "Truck " + truckID + ": Gallons exceeds tank capacity";
        }
    }

    public static double getTotalFuel() {return totalFuel;}

    public String toString() {
        return "Truck: " + truckID + "\n" + "Odometer: " + odometer + "\n" + "Miles Per Gallon: " + mpg + "\n" + "Fuel: " + fuel;
    }
}



