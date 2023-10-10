import java.util.StringTokenizer;

public class Stack {

        String removeOuterParentheses(String s) {
                Stack  st = new Stack();
                StringTokenizer pa = new StringTokenizer(s);
                while (pa.hasMoreElements()){
                        String t = pa.nextToken();
                        if (t.equals("(")){
                                st.Push(t);
                        } else if (St.IsEmpty()) {
                                return false;
                        }else {
                                st.Pop();
                        }
                        return st.IsEmpty
                }
        }
}
