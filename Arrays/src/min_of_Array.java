public class min_of_Array {
    public static void main(String[] args) {
        int[] arr = {2,3,5,6,13,12,99,67,45};
        int n = arr.length-1;
        int min= arr[0];

        for(int i =0;i<=n;i++){
            if(arr[i]<=min) min=arr[i];
        }
        System.out.println(min);

    }
}
