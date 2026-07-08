public class Floor_In_Sorted_Array {

        public int findFloor(int[] arr, int x) {
            int last = -1;
            int lo = 0;
            int hi = arr.length-1;
            while(lo<=hi){
                int mid = lo + (hi - lo)/2;
                if(arr[mid]>x){
                    hi = mid - 1;
                }else if (arr[mid]<=x){
                    last = mid;
                    lo = mid + 1;
                }
            }
            return last;

        }
    }



