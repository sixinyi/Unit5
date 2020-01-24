public class CarTripTester {
    public static void main(String[] args){
        CarTrip trip1 = new CarTrip();
        CarTrip trip2 = new CarTrip(6,16,9,8);
        System.out.println(trip1.getMyStartOdometer());
        System.out.println(trip1.getMyEndOdometer());
        System.out.println(trip1.getMyTime());
        System.out.println(trip1.getMyGallonsUsed());
        System.out.println(trip1.getTripDistance());
        System.out.println(trip1.getAverageSpeed());
        System.out.println(trip1.getGasMileage());
        System.out.println(trip1.getTotalGasPrice(6));
        System.out.println(trip2.getMyStartOdometer());
        System.out.println(trip2.getMyEndOdometer());
        System.out.println(trip2.getMyTime());
        System.out.println(trip2.getMyGallonsUsed());
        System.out.println(trip2.getTripDistance());
        System.out.println(trip2.getAverageSpeed());
        System.out.println(trip2.getGasMileage());
        System.out.println(trip2.getTotalGasPrice(6));
        System.out.println(trip1);
        System.out.println(trip2);
    }
}