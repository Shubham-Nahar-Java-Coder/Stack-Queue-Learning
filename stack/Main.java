package stack;

public class Main {
    public static void main(String[] args) {
        Stack myStack = new Stack(1);

        // myStack.printStack();        

        myStack.push(2);
        myStack.push(3);
        myStack.push(4);

        myStack.printStack();

        System.out.println("Remove Top Element: "+myStack.pop().value);
    }
}
