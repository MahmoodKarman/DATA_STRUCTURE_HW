
package reverse_stack;

public class array_stack<E>implements stack1<E> {
    E data[];
    static final int CAPACITY=100;
    int t=-1;

    public array_stack(int c) {
      data= (E[])new Object[c];
    }

    public array_stack() {
        this(CAPACITY);

    }

    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }




    @Override
    public void push(E element) {
        if (size()==data.length)
             throw new IllegalStateException("Stack is full");

        data[++t]=element;
    }

    @Override
    public E pop() {
      if(isEmpty())  return null;
        E x=data[t];
        data[t]=null;
        t--;
        return x;
    }

    @Override
    public E top() {
      if(isEmpty())  return null;
        return data[t];
    }
}


