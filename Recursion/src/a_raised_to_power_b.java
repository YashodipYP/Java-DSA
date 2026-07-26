import java.util.Scanner;

public class a_raised_to_power_b {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Base:");
        int a = sc.nextInt();
        System.out.println("Power");
        int b = sc.nextInt();
        System.out.println(Math.pow(a,b));
    }
    public static int pow(int a , int b){
        if(b==0)return 1;
        return a*pow(a,b-1);

    }
}
