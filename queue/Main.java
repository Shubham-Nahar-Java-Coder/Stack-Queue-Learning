package queue;

public class Main {
    
    public static void main(String[] args){

        Queue myQueue = new Queue(1);

        myQueue.printQueue();

        myQueue.enqueue(2);
        myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        myQueue.printQueue();

        System.out.println(myQueue.dequeue().value);

    }
}
