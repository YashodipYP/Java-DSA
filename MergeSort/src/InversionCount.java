/**Given an array of integers arr[]. You have to find the Inversion Count of the array. Inversion count is the number of pairs of elements (i, j) such that i < j and arr[i] > arr[j].

Examples:

Input: arr[] = [2, 4, 1, 3, 5]
Output: 3
Explanation: The sequence 2, 4, 1, 3, 5 has three inversions (2, 1), (4, 1), (4, 3).
Input: arr[] = [2, 3, 4, 5, 6]
Output: 0
Explanation: As the sequence is already sorted so there is no inversion count.
Input: arr[] = [10, 10, 10]
Output: 0
Explanation: As all the elements of array are same, so there is no inversion count.
        Constraints:
        1 ≤ arr.size() ≤ 105
        1 ≤ arr[i] ≤ 104         **/


public class InversionCount {

        static int count = 0;
        public int inversionCount(int arr[]) {
            count = 0;
            mergesort(arr,0,arr.length -1);
            return count;


        }
        public static void mergesort(int[] arr,int left,int right){
            if(left<right){
                int mid = left + (right-left)/2;

                mergesort(arr,left,mid);
                mergesort(arr, mid+1, right);

                merge(arr,left,mid,right);
            }
        }
        public static void merge(int[] arr,int left,int mid,int right){
            int n1 = mid - left + 1;
            int n2 = right-mid;

            int[] l = new int[n1];
            int[] r = new int [n2];

            for(int i =0;i<n1;i++)
                l[i]=arr[left + i];
            for(int j = 0;j<n2;j++)
                r[j]=arr[mid+1+j];

            int i = 0,j=0,k=left;

            while(i<n1 && j<n2){
                if(l[i]<=r[j]) {
                    arr[k] = l[i];
                    i++;
                }else{
                    arr[k]=r[j];
                    count +=(n1-i);
                    j++;
                }
                k++;
            }
            while(i<n1){
                arr[k]=l[i];
                i++;
                k++;
            }
            while(j<n2){
                arr[k]=r[j];
                j++;
                k++;
            }


        }

    }


