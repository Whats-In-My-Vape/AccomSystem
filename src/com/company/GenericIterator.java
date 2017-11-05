package com.company;

/**
 * Created by User1 on 05/11/2017.
 */
import java.util.Iterator;
//import java.util.function.Consumer;

public class GenericIterator<I> implements Iterator<I> {

    private GenericNode<I> position;

    public GenericIterator(GenericNode<I> head) {
        position = head;
    }

    @Override
    public boolean hasNext() {
        return position != null;
    }

    @Override
    public I next() {
        GenericNode<I> temporary = position;
        position = position.getNext();
        return temporary.getObject();
    }
}