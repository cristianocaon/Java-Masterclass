package com.company;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    public ListItem next() {
        return this.nextItem;
    }

    @Override
    public ListItem setNext(ListItem item) {
        this.nextItem = item;
        return this.nextItem;
    }

    @Override
    public ListItem previous() {
        return this.previousItem;
    }

    @Override
    public ListItem setPrevious(ListItem item) {
        this.previousItem = item;
        return this.previousItem;
    }

    @Override
    public int compareTo(ListItem item) {
        if(item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
