package controller;

import model.UserAccount;

class Node {
    public UserAccount data;
    public Node next;
    
    public Node (UserAccount account) {
        data = account;
    }
}

class LinkList { //class name are connected to constructor, class - class
    private Node first; //reference to first node on list

    public LinkList() { //constructor
        first = null;
    }

    public UserAccount find(String username, String password) {
        Node current = first;
        while (current != null) {
            UserAccount account = current.data;
            if (account.getUsername().equals(username) && account.getPassword().equals(password)) {
                return account;
            }
            current = current.next;
        }
        return null;
    }

      public void displayList(){ //display the list
        for  (Node current = first; current != null; current = current.next) {
            System.out.println(current.data);
        }
    }

    public void insertFirst(UserAccount account) {
        Node temp = first;
        first = new Node(account);
        first.next = temp;
    }

    
}
