package com.company;

import javax.swing.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class MyList<T> implements Collection {
    class Node<T> {
        private T value;
        private Node<T> nextNode;

        public Node(T value) {
            this.value = value;
            this.nextNode = null;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }
        public void setNextNode(Node<T> nextNode){
            this.nextNode = nextNode;
        }
        public boolean hasNextNode(Node<T> nextNode){
            
        }

        private Node<T> root;
        private long lenght;

        public MyList() {
            this.root = null;
            this.lenght = 0;

        }
    }
    @Override
    public Object[] toArray(IntFunction generator) {
        return new Object[0];
    }

    @Override
    public boolean removeIf(Predicate filter) {
        return false;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public void forEach(Consumer action) {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        Node<T> node = new Node<>((T) o);
        if (root == null){
            this.root = node;
            this.lenght++;
            return true;
        }
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }
}
