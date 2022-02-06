public class Main {
    public static void main(String[] args) {

        BmiService service = new BmiService();
        float result = service.calculate(175, 68);
        System.out.println("индекс масы тела: " + result);
    }
}
