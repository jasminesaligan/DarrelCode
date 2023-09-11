class Node {
    public int iData; //data item(key)
    public Node next; // next node in list

    public Node(int id) { //constructor
        iData = id;
    }
}

class LinkList { //class name are connected to constructor, class - class
    private Node first; //reference to first node on list

    public LinkList() { //constructor
        first = null;
    }

    public Node find (int key) {
        Node current = first; //start at the first node
        while (current != null && current.iData != key) {
            current = current.next; //go to next node
        }
        return current;
    }

    public void displayList(){ //display the list
        for  (Node current = first; current != null; current = current.next) {
            System.out.println(current.iData); //print data
        }
    }

    public void insertFirst (int key) { //insert a node at the front of the list

        Node head = new Node(key);
        head.next = first;
        first = head;
        

    }

    public Node delete(int key) { //delete the node with a given key
        
        Node current = first;
        Node previous = null;

        while (current != null && current.iData != key){
        previous = current;
        current = current.next;
        }

        if (previous == null) {
            return null;
        }

        if (previous == null) {
            first = current.next;
        } else {
            previous.next = current.next;
        }

        return current;
    }
}

class LinkListApp {
    public static void main(String[] args) throws Exception {


        LinkList theList = new LinkList(); //create a list
        
        theList.insertFirst(22);
        theList.insertFirst(44);
        theList.insertFirst(66);
        Node d = theList.delete(44);
        d = theList.delete(88);
        theList.displayList(); //display list

    }
}
