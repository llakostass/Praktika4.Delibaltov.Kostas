package Nomer2;

public class Node
{
    public int age;

    public Node next,prev;
    @Override
    public String toString() {
        return "Node{" +
                "age=" + age  +
                '}';
    }

    public boolean compareTo(int age) {
        if(this.age == age) return true;
        else return false;
    }


    public Node(int age) {
        this.age = age;
    }
}
