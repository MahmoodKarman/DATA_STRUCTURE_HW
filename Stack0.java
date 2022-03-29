package reverse_stack;

import java.util.Arrays;


public class Stack0 {
    public static void main(String[] args) {
        int[]a={11,12,13,14,15};
        System.out.println(Arrays.toString(a));
        array_stack<Integer>s= new array_stack<>(a.length);
        for (int i = 0; i <a.length ; i++) {
        s.push(a[i]);
        }
        for (int i = 0; i <a.length ; i++) {
           a[i]= s.pop();
        }
        System.out.println("after revers using stack");
        System.out.println(Arrays.toString(a));

    }
}
