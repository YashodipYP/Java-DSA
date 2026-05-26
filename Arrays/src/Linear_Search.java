public class Linear_Search {
    public static void main(String[] args) {
        int[] arr = {12, 3, 27, 53, 18, 62, 88, 6};
        int target = 53;
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                flag = true;
                break;
            }
        }
        if (flag == true) System.out.println("exists");
        else System.out.println("Missing");
    }
}
