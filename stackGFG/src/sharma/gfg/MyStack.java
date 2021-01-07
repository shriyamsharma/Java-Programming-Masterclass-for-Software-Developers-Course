package sharma.gfg;

public class MyStack {
    int top = -1;
    int[] arr = new int[5];

    public void push(int x){
        if (top < arr.length-1){
            top++;
            arr[top] = x;
        } else {
            System.out.println("StacK Overflow");
        }
    }

    public void pop(){
        if (top > -1) {
            int res = arr[top];
            top--;
            System.out.println(res);
        } else {
            System.out.println("Stack underflow");
        }
    }

    void isEmpty(){
        if (top == -1){
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }


}
