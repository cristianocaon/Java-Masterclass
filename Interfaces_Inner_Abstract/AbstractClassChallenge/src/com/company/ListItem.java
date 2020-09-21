package com.company;

public abstract class ListItem {
    protected ListItem previousItem = null;
    protected ListItem nextItem = null;
    protected Object value;

    public abstract ListItem next();

    public abstract ListItem setNext(ListItem item);

    public abstract ListItem previous();

    public abstract ListItem setPrevious(ListItem item);

    public abstract int compareTo(ListItem item);

    public ListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
