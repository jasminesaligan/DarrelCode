import java.util.Iterator;
import java.util.Random;

public class SortedList<Item extends Comparable<Item>> implements Iterable<Item> {
    //sort
    private class Node {
        Item item;
        Node next;
    }
   
    private Node first;
    
    public Iterator<Item> iterator() {
        return new Iterator<Item>() {
            Node node = first;
            
            public boolean hasNext() {
                return (node != null);
            }
            
            public Item next() {
                Item item = node.item;
                node = node.next;
                return item;
            }
        };
    }
    
    public String toString() {
        String str = "";
        for (Item s : this) {
            str += s + "->";
        }
        return str;
    }
    
    public void insertInOrder(Item item) {
        // Note: assumes list is in order from least to greatest as dictated 
        // by Item's implementation of Comparable interface
        //insert code here

        Node temp = new Node();
        temp.item = item;

        if (first == null) {
            first = temp;
            return;
        }

        Node current = first;
        Node previous = null;

        while(current != null && current.item.compareTo(item) < 0) {
            previous = current;
            current = current.next;
        }

        if (previous == null){
            temp.next = first;
            first = temp;
        } else {
            temp.next = current;
            previous.next = temp;
        }
    }

    public static void main(String[] args) {
        SortedList<Integer> list = new SortedList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            list.insertInOrder(random.nextInt(200));
        }
        System.out.println(list);
    }
}
