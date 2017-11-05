package com.company;

/**
 * Created by User1 on 04/11/2017.
 */
public class GenericNode<T> {
    private T value;
    private GenericNode<T> node;


    public GenericNode(T value) {
        this.value=value;
    }
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }
    public GenericNode<T> getNode() {
        return node;
    }
    public void setNode(GenericNode<T> node) {
        this.node = node;
    }


}
