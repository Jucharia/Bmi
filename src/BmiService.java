public class BmiService {
    public int calculate(double weight, double height) {
        double x;
        weight = 62;
        height = 1.55;
        x = weight / (height * height);
        int result = (int) x;
        return result;

    }
}
