package com.company;

public class LinkedList implements NodeList {
    private ListItem root = null;

    public LinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(this.root == null) {
            // list was empty.
            this.root = newItem;
            return true;
        }
        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if(comparison < 0) {
                // newItem is greater, move right if possible
                if(currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if(comparison > 0) {
                // newItem is less
                if(currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setPrevious(newItem);
                } else {
                    // node with a previous is the root
                    newItem.setNext(this.root).setPrevious(newItem);
                    this.root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if(item != null) {
            System.out.println("Deleting item: " + item.getValue());
        }

        ListItem currentItem = this.root;
        while(currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if(comparison == 0) {
                // found the item.
                if(currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if(currentItem != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if(comparison < 0) {
                currentItem = currentItem.next();
            } else {
                // not in the list
                return false;
            }
        }
        // end of the list
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if(root == null) {
            System.out.println("The list is empty.");
        } else {
            while(root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
//        }
//        if(root != null) {
//            System.out.println(root.getValue());
//            traverse(root.next());
        }
    }
}
