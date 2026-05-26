import java.sql.SQLOutput;

public class Passing_Array_to_Methods {
    public static void main(String[] args) {
        int x[] = {10,3,29,38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] x){
        x[2]=99;

    }
}
