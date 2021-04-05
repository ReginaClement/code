import java.util.*;

public class ArrayStack {
    public static void main(String[] args) {
        Stack stack = new Stack();
        System.out.println("push " +stack.push(7));
        System.out.println("push " +stack.push(79));
        System.out.println("push " +stack.push(70));
        System.out.println("pop " +stack.pop());
        System.out.println("peek " +stack.peek());
        System.out.println("pop  " +stack.pop());
        System.out.println("peek " +stack.peek());


    }
    static class Stack
    {
        int[] array = new int[10];
        int data = 0;
        private int push(int x)
        {
            data++;
            array[data] = x;
            return x;
        }
        private int pop()
        {
            int y = array[data--];
            return y;
        }
        private int peek()
        {
            return array[data];
        }

    }
}
