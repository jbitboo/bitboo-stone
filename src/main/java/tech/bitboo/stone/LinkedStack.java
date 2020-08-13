package tech.bitboo.stone;

public class LinkedStack<T> extends SinglyLinkedList<T> implements Stack<T>
{
    @Override
    public void push(T value)
    {
        super.append(value);
    }

    @Override
    public T pop()
    {
        return super.delete_last();
    }
}
