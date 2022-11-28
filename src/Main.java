public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        float w = 63.5f;
        float g = 162.5f;

        float bmi = service.calculate(w, g);
        System.out.printf("Индекс массы тела = %.2f", bmi);
    }
}
