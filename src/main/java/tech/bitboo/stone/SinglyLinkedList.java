package tech.bitboo.stone;

public class SinglyLinkedList<T>
{
    private int size;
    public Node root;
    public Node tail;

    protected SinglyLinkedList()
    {
        root = new Node();
        tail = root;
    }

    public int size()
    {
        return this.size;
    }

    public void append(T element)
    {
        Node to_append = new Node();
        to_append.data = element;

        tail.next = to_append;
        tail = to_append;

        size++;
    }

    public T delete_first()
    {
        if (size == 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Node temp = root.next;
        root.next = root.next.next;
        size--;
        return temp.data;
    }

    public T delete_last()
    {
        if (size == 0)
        {
            throw new IndexOutOfBoundsException();
        }

        Node near_last = find_near_last();
        Node last = near_last.next;

        tail = near_last;
        near_last.next = null;
        size--;
        return last.data;
    }

    private Node find_near_last()
    {
        Node temp = root;

        while (temp.next.next != null)
        {
            temp = temp.next;
        }

        return temp;
    }

    public void reverse()
    {
        if (size > 1)
        {
            Node former = root.next;
            Node cur = root.next.next;

            while (cur != null)
            {
                Node next = cur.next;
                cur.next = root.next;
                root.next = cur;
                former.next = next;

                cur = next;
            }

            tail = former;
        }
    }

    class Node
    {
        T data;
        Node next;
    }
}
