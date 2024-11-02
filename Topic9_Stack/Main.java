package Topic9_Stack;

class Stack {
    int numStack[] = new int[5];
    int top;
    int size;

    public Stack() {
        top = -1;
        size = numStack.length;
    }

    void push(int data) {
        if (top + 1 < size) {
            System.out.println("data pushhed into stack:"+data);
            numStack[++top] = data;
        } else {
            System.out.println("StackOverflow: Cannot push " + data);
        }
    }

    int pop() {
        if (top > -1) {
            return numStack[top--];
        } else {
            System.out.println("StackUnderflow: Cannot pop");
            return Integer.MIN_VALUE; // Return a sentinel value
        }
    }

    int peek() {
        if (top > -1) {
            return numStack[top];
        } else {
            System.out.println("StackUnderflow: Cannot peek");
            return Integer.MIN_VALUE; // Return a sentinel value
        }
    }

    boolean isempty(){
        return numStack.length==0;
    }

    boolean isfull(){
        return numStack.length==size;
    }

    void printvalues() {
        if (top == -1) {
            System.out.println("Stack is empty");
        }
        else{
            
            System.out.print("Stack elements: ");
            for (int i = 0; i <= top; i++) {
                System.out.print(numStack[i] + " ");
            }
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Stack numStack = new Stack();

        numStack.printvalues();

        System.out.println("Pop: " + numStack.pop()); // Should print StackUnderflow
        System.out.println("Peek: " + numStack.peek()); // Should print StackUnderflow

        numStack.push(1);
        numStack.push(2);

        System.out.println("Pop: " + numStack.pop()); // Should print 2
        System.out.println("Peek: " + numStack.peek()); // Should print 1

        numStack.push(3);
        numStack.push(4);
        numStack.push(5);
        numStack.push(6); // Should trigger StackOverflow

        numStack.printvalues(); // Should print the current stack content
    }
}
