import java.util.ArrayList;

public class ARRAYLIST {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(18);
        arr.add(5);
        arr.add(10);
        System.out.println(arr.get(2));
        arr.set(3,50);
        arr.add(78);//25 21 18 5 10 78
        arr.add(1,100);
        System.out.println(arr);

        arr.remove(1);
        System.out.println(arr);



    }
}
