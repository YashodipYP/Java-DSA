public class plus {
    public static void main(String[] args) {
        String s = "Conor";
        s = s + "is McGregor";
        s += 10 ;
        System.out.println(s);
        System.out.println("ABC"+10+20);//ABC1020
        System.out.println(10+20+"ABC");//30ABC
        System.out.println("ABC"+(10+20));//ABC30
        System.out.println('A'+2+"ABC");//67ABC char > String
    }
}
