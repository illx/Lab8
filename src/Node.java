import java.util.Scanner;
import java.io.*;

public class Node {

    protected int data;
    protected Node next;

    Node()
    {
        next = null;
    }
    public Node(int arg)
    {
        data = arg;
        next = null;
    }

    public void Set_Data(int new_data)
    {
        data = new_data;
    }


    public void Set_Next(Node new_next)
    {
        next = new_next;
    }


    public Node Get_Next()
    {
        return next;
    }

    public int Get_Data()
    {
        return data;
    }
}
