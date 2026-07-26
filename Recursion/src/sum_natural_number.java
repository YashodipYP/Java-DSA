public class sum_natural_number {
    public static int findsum(int n){
        if(n==1) return 1;
        return n+ findsum(n-1);

    }

}
