public class PalindromeString {
    public static void main(String[] args) {
        String s = "markram";
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not Palindrome");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Palindrome");
    }
}