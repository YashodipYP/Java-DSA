public class Sum_Of_Elements_Of_Array {
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,7,45,67,23};
        int n = arr.length-1;
        int sum = 0;
        for(int i =0; i<=n; i++){
            sum+=arr[i];

        }
        System.out.println(sum);
    }
}
