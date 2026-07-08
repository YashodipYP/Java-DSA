public class PassingStringToMethod {
    public static void change(String x) {
        x="Abcd";

    }
    public static void main(String[] args) {
        String x = "XYZC";
        System.out.println(x);
        change(x);
        System.out.println(x);

    }
}
