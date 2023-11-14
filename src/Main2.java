public class Main2 {

    static double a;

    static double b;

    static double total;

    static int c;

    static double day;


    public static void main(String[] args) {

        String product = "Product No2:Laptop";
        a = 1498.12;

        b = 10486.85;

        c = 7;

        total = a * c;

        day = b / c;

        System.out.println(product);

        System.out.println("total sales for 7 days is EUR  " + total);

        System.out.printf("sales by day is EUR"+day);
    }
}
