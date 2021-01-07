package sharma.gfg;
import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        //Note linkedlist is not only one class in queue we can use priorityqueue, synchronousqueue
        //queue uses linkedList
        Queue<Integer> q = new LinkedList<Integer>();
        q.add(10);
        q.add(5);
        q.add(15);
        System.out.println(q.peek());
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q.size());
    }
}
