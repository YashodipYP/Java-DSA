public class Factorial_Of_Number {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        int ans  = n * fact(n-1);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(fact(5));
    }
}
