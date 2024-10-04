public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weghtKg = 98;
        double heightM = 1.87;
        int BMI = service.calculate(weghtKg, heightM);
        System.out.println(BMI);
    }
}
