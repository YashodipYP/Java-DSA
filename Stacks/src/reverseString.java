import java.util.Stack;

class Solution {
        public String reverse(String S) {
            String result="" ;
            Character character;
            Stack<Character> st = new Stack<>();
            for(int i = 0;i<S.length();i++){
                char ch = S.charAt(i);
                st.push(ch);
            }
            while(st.size()!=0){
                character = st.pop();
                result = result + character;
            }
            return result;
        }

    }
