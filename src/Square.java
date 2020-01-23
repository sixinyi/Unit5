public class Square {
    private double side;

    public Square(double a){
        side = a;
    }

    public double calculateArea(){
        return side * side;
    }

    public String toString(){
        return "Square with side "+side;
    }

}