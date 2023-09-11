import java.util.Iterator;
import java.util.Random;

public class SortedList<Item extends Comparable<Item>> implements Iterable<Item> {
    
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
        Node newNode = new Node();
        newNode.item = item;

        if (first == null) {
            first = newNode;
            return;
        }

        Node current = first;
        Node previous = null;

        while(current != null && current.item.compareTo(item) < 0) {
            previous = current;
            current = current.next;
        }

        if (previous == null){
            newNode.next = first;
            first = newNode;
        } else {
            newNode.next = current;
            previous.next = newNode;
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
