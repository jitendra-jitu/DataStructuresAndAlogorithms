package Topic9_Stack;

import java.util.Stack;

public class InbuiltStack {

    public static void main(String[] args) {
        
        Stack<Integer> numStack=new Stack<>();

        numStack.push(1);
        numStack.push(2);
        numStack.pop();
        numStack.push(3);
        numStack.push(4);

        System.out.println(numStack);

    }
    
}
