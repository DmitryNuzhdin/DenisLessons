package tasks.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


public class CustomLinkedList<E> implements List<E> {
    // этот класс должен быть реализацией интерфейса List (только методы size, add, get, remove)
    // реализация должна быть в виде связного списка (аналог LinkedList)
    // https://ru.wikipedia.org/wiki/%D0%A1%D0%B2%D1%8F%D0%B7%D0%BD%D1%8B%D0%B9_%D1%81%D0%BF%D0%B8%D1%81%D0%BE%D0%BA

    public class Node<E> {
        E elem;
        Node<E> next;

        private Node(E elmnt, Node<E> next) {
            this.elem = elmnt;
            this.next = next;
        }
    }

    protected Node<E> zeroNode = null;
    protected int size = 0;

    public CustomLinkedList() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node<E> answerNode = zeroNode;
        for(int i = 0; i < index; i++){
            answerNode = answerNode.next;
        }

        return answerNode.elem;
    }

    @Override
    public boolean add(E e) {
        Node<E> newNode = new Node<>(e,null);
        if (size == 0)
            zeroNode = newNode;
        else {
            Node<E> currentNode = zeroNode;
            for(int i = 0; i < size - 1; i++){
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size = size + 1;
        return true;
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node<E> currentNode = zeroNode;

        if (index == 0) {
            zeroNode = zeroNode.next;
        } else {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;
            }
            currentNode.next = currentNode.next.next;
        }
        size--;
        return null;
    }


    // методы ниже реализовывать не нужно, оставить их как есть


    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E set(int index, E element) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<E> listIterator() {
        return null;
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        return null;
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        return null;
    }
}
