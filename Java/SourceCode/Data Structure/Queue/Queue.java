import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your desired number of elements: ");
        int size = scanner.nextInt();
 
        System.out.println();
     
        int halfsize = size/2;
 
        System.out.println();
 
        for (int i = 1; i <= size; i++) {
            System.out.print("Enter element " + "[" + i + "]" + ": ");
            int element = scanner.nextInt();
            enqueue(que, element);
        }
 

        reverseFirstKElements(que, halfsize);
        System.out.println("Reversed queue of the first half " +  " elements: " + que);
 
    }

    public static void enqueue(Queue<Integer> que, int element) {
        que.add(element);
    }
 
    public static void dequeue(Queue<Integer> que) {
        if (!que.isEmpty()) {
            que.poll();
        }
    }
 
    public static void reverseFirstKElements(Queue<Integer> que, int element) {
 
        int[] queArray = new int[element];
        for (int i = 0; i < element; i++) {
            queArray[i] = front(que);
            dequeue(que);
        }
 
        for (int i = element - 1; i >= 0; i--) {
            enqueue(que, queArray[i]);
        }
 
        for (int i = 0; i < que.size() - element; i++) {
            enqueue(que, front(que));
            dequeue(que);
        }
    }
 
    // Custom implementation of front to get the front element of the queue
    public static int front(Queue<Integer> queue) {
        if (!queue.isEmpty()) {
            return queue.peek();
        }
        return -1; // Return -1 if the queue is empty (you can choose a different sentinel value)
    }
}
