import java.util.Stack;

class ReverseStringBetweenEachPairOfParentheses{
    public static void main(String[] args) {
        String s = "(ed(et(oc))el)";
        String rev = reverseParentheses(s);
        System.out.println("Final String :- "+rev);
    }
    public static String reverseParentheses(String s){
        Stack<Character> st = new Stack<Character>();
        char[] ar = s.toCharArray();
        for(char c : ar){
            if(c == '('){
                st.push(c);
            }else if(c == ')'){
                String temp = "";
                while(st.peek() != '('){
                    temp += st.peek();
                    st.pop();
                }
                st.pop();
                for(char ch:temp.toCharArray()){
                    st.push(ch);
                }
            }else{
                st.push(c);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.peek());
            // System.out.println(st.peek());
            st.pop();
        }
        return ans.reverse().toString();
    }
}