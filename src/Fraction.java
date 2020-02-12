/**
 * @author Bruce
 * @since 2/11/2020
 * This program performs basic math functions with fractions.
 * Including default constructor, constructor, and methods.
 */
public class Fraction {

    private int numerator;
    private int denominator;

    /**
     * Use given numerator and denominator to generate fraction, check negative number and simplify.
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
        int num = reduce(numerator, denominator);
        denominator /= num;
        numerator /= num;

        if(denominator < 0 && numerator > 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
        else if(denominator < 0 && numerator < 0)
            denominator = -denominator;
    }
    /**
     * Create constructor creates a fraction 1/1
     */
    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }

}
