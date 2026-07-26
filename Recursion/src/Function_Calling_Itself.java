public class Function_Calling_Itself {
    public static void main(String[] args) {
        ajay(1);
    }
    public static void ajay(int n){
        if(n==10) return;
        System.out.println("priya");
        ajay(n+1);
    }
}