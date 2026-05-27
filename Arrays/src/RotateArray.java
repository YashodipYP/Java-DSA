public class RotateArray {
    static void rotate(int[]arr,int d){
         int n = arr.length;
         d%=n;
         reverse(arr,0,d-1);
         reverse(arr,d,n-1);
         reverse(arr,0,n-1);
    }
    static void reverse(int[] arr,int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args) {
        //int d = 3;
        int [] arr= {2,4,6,9,8,3,1};
        rotate(arr,2);

        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}
