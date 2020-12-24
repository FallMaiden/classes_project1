/**
 *A class that represents a fraction with an
 * integer numerator and denominator
 * @author Regina Vanata
 * @version 1.0
 */
public class RationalNumber
{
    private int numerator;
    private int denominator;

    /**
     * constructs a new rational number to represent the ratio (numerator/denominator)
     * The denominator cannot be 0, so an IllegalArgumentException is thrown
     * is thrown if 0 is passed
     * @param numerator represents the numerator of the rational number
     * @param denominator represents the denominator of the rational number
     */
    public RationalNumber(int numerator, int denominator)
    {
        if(denominator == 0)
        {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    /**
     *
     */
    public RationalNumber()
    {
        this.numerator = 0;
        this.denominator = 1;
    }

    /**
     * @return an int representing the denominator of a RationalNumber
     */
    public int getDenominator()
    {
        return denominator;
    }

    /**
     * @return an int representing the numerator of a RationalNumber
     */
    public int getNumerator() {
        return numerator;
    }

    /**
     * Returns a string representation of the object. In general, the
     * {@code toString} method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The {@code toString} method for class {@code Object}
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `{@code @}', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString()
    {
        if(denominator == 1)
        {
            return "" + numerator;
        }
        return numerator + "/" + denominator;
    }
}
