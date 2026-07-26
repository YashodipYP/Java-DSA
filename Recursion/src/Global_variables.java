public class Global_variables {
    static int x = 10;
    public static void fun(){
        x = 20;
    }

    public static void main(String[] args) {
        fun();
        System.out.println(x);
        System.out.println("Hello");
    }
}
