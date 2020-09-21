package com.company;

public class Main {

    public static void main(String[] args) {
        SearchTree searchTree = new SearchTree(null);
        searchTree.traverse(searchTree.getRoot());
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s: data) {
            searchTree.addItem(new Node(s));
        }
        searchTree.traverse(searchTree.getRoot());

    }
}
