package Nomer2;
public class Iterator
{
    private List l;
    public boolean hasNext()
    {
        if(l.head != null) return true;
        else return false;
    }

    public Iterator(List l) {
        this.l = l;
    }

    public Node next()
    {
        Node temp = l.head;
        l.deleteNodeHead();
        return temp;

    }
}
