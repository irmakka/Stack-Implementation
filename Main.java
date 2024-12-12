import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        //Pop deletes from top , push adds to top ,peek takes  from top .LIFO 
        Stack <Integer> myStack=new Stack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        System.out.println(myStack.peek());
        int poppedElement=myStack.pop();
        System.err.println(poppedElement);
        System.out.println(myStack.peek());
        myStack.push(4);
        myStack.push(5);
        myStack.push(6);
        System.out.println(myStack);
        while(!myStack.isEmpty()){
            System.out.println("Popped Element"+myStack.pop());
        } 


    }
}
