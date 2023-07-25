public class Main {
    public static void main(String[] args) {

     MilesService service = new MilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);

    }
}



