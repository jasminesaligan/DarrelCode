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

    public void printAccounts() {
        Node current = first;
        while (current != null) {
            UserAccount account = current.data;
            System.out.println("Username: " + account.getUsername());
            System.out.println("Password: " + account.getPassword());
            System.out.println("-----------------------------");
            current = current.next;
        }
    }

    public void insertFirst(UserAccount account) {
        Node temp = first;
        first = new Node(account);
        first.next = temp;
    }

    
}
