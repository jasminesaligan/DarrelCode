package controller;

public class DataManager {
    private static final LinkList accounts = new LinkList();

    public static LinkList getAccounts() {
        return accounts;
    }
}
