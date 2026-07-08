public class Stringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("ABC");
        System.out.println(sb);
        sb.append("EFGH");
        System.out.println(sb);


        StringBuilder bs = new StringBuilder(7);
        System.out.println(bs.length()+" "+ bs.capacity());
        bs.append("EFGH");
        System.out.println(bs.length()+" "+ bs.capacity());
    }


}
