// 2020.2.3 Bruce

public class Truck {
    private String truckID;
    private double odometer;
    private double mpg;
    private double fuel;

    private static final double CAPACITY = 20;
    private static double totalFuel;

    public Truck(String tid){
        truckID = tid;
    }

    public Truck(String tid, double odm, double mg, double gas){
        truckID = tid;
        odometer = odm;
        mpg = mg;
        fuel = gas;
    }

    public String getTruckID() {return truckID;}
    public double getOdometer() {return odometer;}
    public double getMpg() {return mpg;}
    public double getFuel() {return fuel;}



    public void setMpg(double nmg) {
        mpg = nmg;
    }

    public boolean enoughFuel(double mi){
        double want = mi/mpg;

        if(fuel < want){
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


    public void fill(){
        totalFuel += (CAPACITY - fuel);
        fuel = CAPACITY;//原来这里是=20
    }

    public String fill(double gas){
        if(fuel + gas <= CAPACITY){//原本totalFuel 《=
            fuel += gas;
            totalFuel += gas;
            return "success";
        }
        else{
            return "Truck " + truckID + ": Gallons exceeds tank capacity";
        }
    }

    public static double getTotalFuel() {return totalFuel;}

    public String toString() {
        return "Truck: " + truckID + "\n" + "Odometer: " + odometer + "\n" + "Miles Per Gallon: " + mpg + "\n" + "Fuel: " + fuel;
    }
}



