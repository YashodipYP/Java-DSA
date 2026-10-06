import java.util.Stack;

public class postFix {

        public int evaluatePostfix(String[] arr) {
            Stack<Integer> st = new Stack<>();

            for (int i = 0; i < arr.length; i++) {
                String token = arr[i];

                if (token.equals("+") || token.equals("-") ||
                        token.equals("*") || token.equals("/") ||
                        token.equals("^")) {

                    int a = st.pop();
                    int b = st.pop();

                    int result = 0;

                    if (token.equals("+")) result = b + a;
                    else if (token.equals("-")) result = b - a;
                    else if (token.equals("*")) result = b * a;
                    else if (token.equals("/")) result = (int) Math.floor((double) b / a);
                    else if (token.equals("^")) result = (int) Math.pow(b, a);

                    st.push(result);
                } else {
                    st.push(Integer.parseInt(token));
                }
            }

            return st.pop();
        }
    }

