package Nomer2;


public class Main
{
    public static void main(String[] args)
    {
        List l = new List();
        l.addInHead(12);
        l.addInHead(15);
        l.addInHead(20);
        l.addInHead(34);
        l.addInHead(23);
        l.addInHead(89);
        Iterator itr = new Iterator(l);
        while (itr.hasNext())
        {
            //  moving cursor to next element
            Node t = itr.next();

            // getting even elements one by one
            System.out.print(t + " ");

        }

    }
}
