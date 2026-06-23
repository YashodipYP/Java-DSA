public class TwoSum {
    boolean twoSum(int[] arr, int target){
        int n = arr.length;
        for(int i =0; i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,-1};
        int target = 2;
        TwoSum obj = new TwoSum();
        boolean ans = obj.twoSum(arr,target);
        System.out.println(ans);
    }
}
