import java.util.Stack;

public class pushAtBottom {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int ele = 50;
        pushatBottom(st,ele);
        System.out.println(st);

    }
    private static void pushatBottom(Stack<Integer>st,int ele){
        if(st.size()==0){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushatBottom(st,ele);
        st.push(top);
    }
}
