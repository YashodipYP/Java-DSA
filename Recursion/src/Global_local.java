public class Global_local {
    static int x = 10;

    public static void main(String[] args) {
        x = 9; //change
        System.out.println(x);
        int x =4;
        System.out.println(x);
        x=6;
        System.out.println("Hello");
    }

}
