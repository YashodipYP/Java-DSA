public class Reverse_Of_Number {

    public static void reverse(int n, int r){
        if(n==0){
            System.out.println(r);
            return;
        }
        reverse(n/10,r*10+n%10);
    }
    public static void main(String[] args) {
    int n =234;

    reverse(n,0);

    }


}
