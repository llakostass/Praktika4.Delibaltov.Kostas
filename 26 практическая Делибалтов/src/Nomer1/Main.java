package Nomer1;
import java.util.Stack;

public class Main
{
    public static void main(String[] args)
    {
        int [] arr = new int[10];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < 10; i++) {
            arr[i] = i;
            System.out.print(arr[i]+ " ");
            st.push(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++)
        {
            arr[i] = st.pop();
            System.out.print(arr[i]+ " ");
        }
    }
}
