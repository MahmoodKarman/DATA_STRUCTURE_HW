package Lab2;
import java.util.Stack;
public class LAB_2 {
static  int counter=0;
static Stack<Integer>  myStack = new Stack<>();
    public static String PopAll()
    {
        if (myStack.isEmpty())
        {
            return "Nothing to delete.It is already Empty.";
        }
        else
            while (! myStack.isEmpty())
            {
                myStack.pop();
                counter++;
            }
        return "Now Stack is Empty."+"\nStack = "+myStack;
    }
    public static void main(String[] args) {

        for (int i = 0; i <5 ; i++) {
            myStack.push(4);
        }
        System.out.println("Elements pushed to Stack. ");
        System.out.println("Stack = "+myStack);
        System.out.println(PopAll());
        System.out.println("Calling pop() method Times (Element/s Deleted) = "+counter+".");}}
