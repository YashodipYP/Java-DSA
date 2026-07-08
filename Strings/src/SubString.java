public class SubString {
    public static void main(String[] args) {
        String q = "Jaishankar";
        System.out.println(q.substring(3));
        System.out.println(q.substring(1,5));

        String s = "Conor";
        for(int i = 0;i<s.length();i++){
            for(int j = i+1;j<s.length();j++){
                System.out.print(s.substring(i,j+1));
            }
            System.out.println();
        }


    }


}
