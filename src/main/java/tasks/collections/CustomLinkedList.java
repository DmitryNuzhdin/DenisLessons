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
        public E getElem() {
            return elem;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setElem(E elem) {
            this.elem = elem;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    Node<E> firstNode;
    int size = 0;

    public Node<E> getFirstNode() {
        return firstNode;
    }

    public void setFirstNode(Node<E> firstNode) {
        this.firstNode = firstNode;
    }


    public CustomLinkedList() {
        firstNode = new Node<E>(null,null);
    }

    @Override
    public int size() {
        int i = 0;
        Node<E> iter = new Node<E>();
        iter = firstNode;
        while (iter.next != null){
            firstNode.next = iter;
            i = i + 1;
        }
        return i;
    }

    @Override
    public E get(int index) {
        /*int i = 0;
        Node<E> search = new Node<E>(null,null,null)
        while (i < index) {
            search.
            firstNode.getNext().getElem()
        }*/
        return null;
    }

    @Override
    public boolean add(E e) {
        Node<E> new_nod = new Node<E>(e,null);
        firstNode.next = new_nod;
        size = size + 1;
        return false;
    }

    @Override
    public E remove(int index) {
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
