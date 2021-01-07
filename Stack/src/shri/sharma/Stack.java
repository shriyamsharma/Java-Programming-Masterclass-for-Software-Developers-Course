package shri.sharma;

public class Stack {
    int stack[] = new int[10];
    int tos;

    Stack() {
        tos = -1;
    }

    //push

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is overflow");
        } else {
            stack[++tos] = item;
        }
    }

    //pop


    int pop() {
        if (tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        } else {
            return stack[tos--];
        }
    }
}
