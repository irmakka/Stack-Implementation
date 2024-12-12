public class Stack {
    int size;
    int top;
    int array[];
    Stack(int size){
        this.size=size;
        this.array=new int[size];
        this.top=-1;
    }
    public void push(int pushedElement){
       if(!isFull()){
         top++;
         array[top]=pushedElement;
         System.out.println("Pushed Element"+pushedElement);
       }
       else{
        System.out.println("No space");
       }
    }
    public  int pop(){
        if(!isEmpty()){
          int poppedIndex=top;
          top--;
         return array[poppedIndex];
        }
        else{
            System.out.println("No element to delete");
            return-1;
        }
    }

    public int peek(){
        if(!isEmpty())
           return array[top];
           else
           return -1;
    }
    public boolean  isEmpty(){
        return (top==-1);
    }
    public boolean isFull(){
        return(size-1==top);
    }

    public static void main(String[] args) {
        Stack myStack= new Stack(3);
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        
        while(!myStack.isEmpty()){
            System.out.println("Popped Element"+myStack.pop());
        } 
    }
}
