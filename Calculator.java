public class Calculator {

    public static double multiply(int a, int b) {

        double num=a*b;


        return num;
    }

    public static double divide(int a, int b) {
        double result;
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = Double.valueOf(a)/Double.valueOf(b);
        }
        return result;
    }
}