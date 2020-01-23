import java.util.Scanner;
public class SquareDriver {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Enter side length please: ");
        double num = input.nextDouble();

        Square n = new Square(num);
        System.out.println(n);
        System.out.println(n.calculateArea());
    }
}