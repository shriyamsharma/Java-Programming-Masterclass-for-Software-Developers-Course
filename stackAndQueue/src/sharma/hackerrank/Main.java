package sharma.hackerrank;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {

    private Stack<Character> stack = new Stack<Character>();
    private Queue<Character> queue = new LinkedList<Character>();

    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Queue<Character> queue = new LinkedList<Character>();

        pushCharacter('s');
        pushCharacter('h');
        enqueueChar('h');
        enqueueChar('s');
        System.out.println(popChar());
        System.out.println(dequeueChar());
    }

    public static void pushCharacter(char ch){
        stack.push(ch);
    }

    public static void enqueueChar(char ch){
        queue.add(ch);
    }

    public static char popChar(){
        return stack.pop();
    }

    public static char dequeueChar(){
        return queue.remove();
    }



}
