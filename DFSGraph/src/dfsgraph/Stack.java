package dfsgraph;

/**
 *
 * @author Nalendraa
 */
public class Stack {

    private int SIZE = 20;
    private int[] st;
    private int top;

    public Stack(int size) {
        st = new int[SIZE];
        top = -1;
    }

    public void push(int j) {
        st[++top] = j;
    }

    public int pop() {
        return st[top--];
    }

    public int peek() {
        return st[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

}
