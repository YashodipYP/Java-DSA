public class NegativeElementsQuestion {
    public static void main(String[] args) {
        int[] arr = {2,-3,4,-5,-6,33,24,-1};
        int n = arr.length-1;
        for (int i =0; i<=n; i++){
            if(arr[i]<0)System.out.println(arr[i]);
        }
    }
}
