/**
 * This program instantiates RationalNumber objects
 * and performs tests
 * @author Regina Vanata
 * @version 1.0
 */
public class Tests
{
    public static void main(String[] args) {
        RationalNumber number1 = new RationalNumber(2,1);
        System.out.println(number1);
        RationalNumber number2 = new RationalNumber(2,5);
        System.out.println(number2);
        RationalNumber number3 = new RationalNumber();
        System.out.println(number3);
    }
}
