public class CyclicSort {
    public static void cycleSort(int[]arr){
        int n = arr.length;

        for(int cycleStart = 0;cycleStart<=n-2;cycleStart++){
            int item = arr[cycleStart];
            int pos = cycleStart;
            for (int i = cycleStart+1;i<n;i++)
                if(arr[i]<item)
                    pos++;
                if(pos == cycleStart)
                    continue;
                while(item == arr[pos])
                    pos+=1;
                if(pos!=cycleStart){
                    int temp = item;
                    item = arr[pos];
                    arr[pos]=temp;
                }
                while(pos!= cycleStart) {
                    pos = cycleStart;

                    for (int i = cycleStart + 1; i < n; i++)
                        if (arr[i] < item)
                            pos += 1;
                    while (item == arr[pos])
                        pos += 1;

                    if (item != arr[pos]) {
                        int temp = item;
                        item = arr[pos];
                        arr[pos] = temp;
                    }
                }
        }
    }

    public static void main(String[] args) {
        {
            int arr[] = {3,5,2,1,4};
            int n = arr.length;
            cycleSort(arr);
            for (int i = 0; i < n; i++)
                System.out.print(arr[i] + " ");
        }
    }
}