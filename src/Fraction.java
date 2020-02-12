/**
 * @author Bruce
 * @since 2/11/2020
 * This program performs basic math functions with fractions.
 * Including default constructor, constructor, and methods.
 */
public class Fraction {
    /**
     * The initial variable
     */
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
        numerator /= num;
        denominator /= num;

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
        this(1,1);
    }
    /**
     * divide the numerator and denominator
     * @param m numerator
     * @param n denominator
     * @return common divide
     */
    private static int gcd(int m, int n) {
        while (m % n != 0) {
            int oldm = m;
            int oldn = n;

            m = oldn;
            n = oldm % oldn;
        }
        return n;
    }

    /**
     * Reduce scores by finding the greatest common factor.
     * @param numerator
     * @param denominator
     * @return for divide int the numerator and denominator
     */
    private static int reduce(int numerator, int denominator) {
        int common = gcd(numerator, denominator);
        return common;
    }
    /**
     *Denominator and numerator multiply by opposite denominator, add and decrease
     * @param a fraction one
     * @param b fraction two
     * @return the simplified added fraction
     */
    public static Fraction add(Fraction a, Fraction b) {
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = a.numerator * b.denominator + a.denominator * b.numerator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        if (newDenominator < 0 && newNumerator > 0) {
            newDenominator *= -1;
            newNumerator *= -1;
        } else if (newDenominator < 0 && newNumerator < 0)
            newDenominator *= -1;
        return new Fraction(newNumerator, newDenominator);
    }
    /**
     * Multiply the denominator and the numerator by the opposite denominator, then add and subtract
     * @param a fraction one
     * @param b fraction two
     * @return the simplified subtract fraction
     */
    public static Fraction subtract(Fraction a, Fraction b) {
        int newDenominator = a.denominator * b.denominator;
        int newNumerator = a.numerator * b.denominator - a.denominator * b.numerator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        if (newDenominator < 0 && newNumerator > 0) {
            newDenominator = -newDenominator;
            newNumerator = -newNumerator;
        } else if (newDenominator < 0 && newNumerator < 0)
            newDenominator = -newDenominator;
        return new Fraction(newNumerator, newDenominator);
    }
    /**
     * simply multiplies numerators, then denominators, then reduces
     * @param a fraction one
     * @param b fraction two
     * @return the simplified multiply fraction
     */
    public static Fraction multiply(Fraction a, Fraction b){
        int newNumerator = a.numerator * b. numerator;
        int newDenominator = a.denominator * b. denominator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        if(newDenominator < 0 && newNumerator > 0) {
            newDenominator = -newDenominator;
            newNumerator = -newNumerator;
        }
        else if(newDenominator < 0 && newNumerator < 0)
            newDenominator = -newDenominator;
        return new Fraction(newNumerator, newDenominator);
    }
    /**
     * Multiplies numerators and denominators, and reduce them
     * @param a fraction one
     * @param b fraction two
     * @return the simplified product divide fractions
     */
    public static Fraction divide(Fraction a, Fraction b){
        int newNumerator = a.numerator * b.denominator;
        int newDenominator = a.denominator * b.numerator;
        int num = reduce(newNumerator, newDenominator);
        newDenominator /= num;
        newNumerator /= num;
        return new Fraction(newNumerator, newDenominator);
    }
    /**
     *
     * @return the assign output
     */
    public String toString(){
        if(denominator < 0 && numerator > 0) {
            denominator = -denominator;
            numerator = -numerator;
        }
        else if(denominator < 0 && numerator < 0)
            denominator = -denominator;
        return numerator + "/" + denominator;
    }
}