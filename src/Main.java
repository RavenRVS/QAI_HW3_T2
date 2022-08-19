public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 78; // вес в килограммах
        int height = 176; // рост указывается в сантиметрах
        int index = service.calculate(weight, height);
        System.out.println("Ваш ИМТ: " + index);
    }
}
