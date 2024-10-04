public class BmiService {
    public int calculate(int weightKg, double heightM) {
        double result = weightKg / Math.pow(heightM, 2);
        return (int) result;
    }

}
