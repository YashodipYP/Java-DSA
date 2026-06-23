public class Bubble_Sort_Btr_Rverse {

    public static void print(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] arr = {5, -2, 6, 7, 2, 0, 7, 2};
        int n = arr.length;

        print(arr);

        for (int i = 0; i < n - 1; i++) {
            boolean isSorted = true;

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j+1] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    isSorted = false;
                }
            }

            if (isSorted) {
                break;
            }
        }

        print(arr);
    }
}