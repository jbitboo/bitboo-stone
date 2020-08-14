package tech.bitboo.stone.collection;

public interface Stack<T>
{
    void push(T value);

    T pop();

    int size();
}
