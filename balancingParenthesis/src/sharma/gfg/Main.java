package sharma.gfg;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        String str = "{(){}}";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String s){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i<s.length(); i++){
            char c = s.charAt(i);
            if ((c == '{') || (c=='[') || (c=='(')){
                stack.push(c);
            } else {
                if (stack.isEmpty()){
                    return false;
                } else if (!match(stack.peek(), c)){
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return (stack.isEmpty());
    }

    static boolean match(char a, char b){
        return ((a == '(') && (b == ')')) || ((a == '{') && (b == '}')) || ((a == '[') && (b == ']'));
    }
}
