public class BmiService {
    public int calculate(double weight, double height) {
        double x;
        double a1 = height;
        double b1 = 2;
        double y = Math.pow(a1, b1); // возведение числа в квадрате(рост)
        x = weight / y;
        int result = (int) x;
        return result;

    }
}
