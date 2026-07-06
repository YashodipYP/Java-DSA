import java.util.ArrayList;
public class first_and_last_Occurence {
    ArrayList<Integer> find(int arr[], int x) {
        ArrayList<Integer> result = new ArrayList<>();

        int first = -1;
        int last = -1;

        // Find first occurrence
        int lo = 0;
        int hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {
                first = mid;
                hi = mid - 1;   // Search left
            } else if (arr[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        // Find last occurrence
        lo = 0;
        hi = arr.length - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;

            if (arr[mid] == x) {
                last = mid;
                lo = mid + 1;   // Search right
            } else if (arr[mid] < x) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        result.add(first);
        result.add(last);

        return result;
    }
}
