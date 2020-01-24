public class CarTrip {
    private double myStartOdometer;
    private double myEndOdometer;
    private double myTime;
    private double myGallonsUsed;

    public CarTrip(double st, double en, double ti, double ga){
        myStartOdometer = st;
        myEndOdometer = en;
        myTime = ti;
        myGallonsUsed = ga;
    }

    public CarTrip(){
        myStartOdometer = 0;
        myEndOdometer = 0;
        myTime = 0;
        myGallonsUsed = 0;
    }

    public double getMyStartOdometer() {
        return myStartOdometer;
    }

    public double getMyEndOdometer() {
        return myEndOdometer;
    }

    public double getMyGallonsUsed() {
        return myGallonsUsed;
    }

    public double getMyTime() {
        return myTime;
    }
    public void setMyStartOdometer(double st) {
        st = myStartOdometer;
    }

    public void setMyEndOdometer(double en) {
        en = myEndOdometer;
    }

    public void setMyGallonsUsed(double ga) {
        ga = myGallonsUsed;
    }

    public void setMyTime(double ti) {
        ti = myTime;
    }

    double getTripDistance(){
        return myEndOdometer - myStartOdometer;
    }

    double getAverageSpeed(){
        if (myTime == 0) {
            double aver = (myEndOdometer - myStartOdometer) / (1 + myTime);
            return aver;
        }else{
            double aver = (myEndOdometer - myStartOdometer)/myTime;
            return aver;
        }
    }

    double getGasMileage(){
        if(myGallonsUsed==0){
            double gasM = (myEndOdometer - myStartOdometer) / (1 + myGallonsUsed);
            return gasM;
        }else {
            double gasM = (myEndOdometer - myStartOdometer) / myGallonsUsed;
            return gasM;
        }
    }

    double getTotalGasPrice(double pricePerGallon){
        return pricePerGallon * myGallonsUsed;
    }

    public String toString(){
        double distance = myEndOdometer - myStartOdometer;
        return "Distance traveled: " + distance + " miles";
    }

    public static void main(String[] args){
    }

}