package Stacks;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedParenthesis {
    public static void main(String[] args) {
        String expr="()()";
        if(isBalanced(expr)){
            System.out.println("Balanced");
        }
        else
            System.out.println("Not balanced");

    }

    private static boolean isBalanced(String expr) {
        Deque<Character> stack=new ArrayDeque<Character>();
        for (int i = 0; i < expr.length(); i++) {
            char x=expr.charAt(i);
            if(x=='('||x=='['||x=='{'){
                stack.push(x);
                System.out.println(stack.peek());
                continue;
            }
            if(stack.isEmpty()){
               return false;
            }
            char check;
            switch(x){
                case ')':
                    check=stack.pop();
                    if(check=='{'||check=='[')
                        return false;
                    break;
                case  '}':
                    check=stack.pop();
                    if(check=='('||check=='[')
                        return false;
                    break;
                case ']':
                    check=stack.pop();
                    if(check=='('||check=='}')
                        return false;
                    break;
            }
        }
        return(stack.isEmpty());
    }

}
