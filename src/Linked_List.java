import java.util.Scanner;
import java.io.*;

public class Linked_List {

    protected Node head;
    Scanner input;

    Linked_List()
    {
        head = null;
        input = new Scanner(System.in);
    }

    public void build()
    {

     int counter;
     System.out.println("Enter the number of nodes in this LLL");
     counter = input.nextInt();
     input.nextLine();
     head = build(head, counter);


    }

    protected Node build(Node head, int counter)
    {
        if(counter == 0)
        {
           head = null;
           return head;
        }
        int new_data;
        System.out.println("Enter data for node");
        new_data = input.nextInt();
        input.nextLine();
        head = new Node();
        head.Set_Data(new_data);

        Node temp = build(head.Get_Next(), counter-1);
        head.Set_Next(temp);

        return head;
    }


    public void display()
    {
        if(head == null)
        {
            System.out.println("List is empty");
            return;
        }

        display(head);
        return;
    }

    protected void display(Node current)
    {
        if(current == null)
            return;

        System.out.println(current.Get_Data() + " ");
        display(current.Get_Next());
    }

    public void reverse()
    {
        if(head == null)
            return;

        Node new_head = reverse(head);
        head.Set_Next(null);
        head = new_head;

        return;

    }

    protected Node reverse(Node current)
    {

        if(current.Get_Next() == null)
        {
            return current;
        }

        Node temp = reverse(current.Get_Next());
        //temp.Set_Next(current);
        current.Get_Next().Set_Next(current);
        return temp;
    }

    public int count_last()
    {
        if(head == null)
            return 0;

        if(head.Get_Next() == null)
            return 0;
        int [] last_data = new int[1];
        last_data[0] = 0;
        int catcher = count_last(head, last_data);
        return catcher;
    }

    protected int count_last(Node current, int [] last_data)
    {
        if(current.Get_Next() == null)
        {
            last_data[0] = current.Get_Data();
            return 0;
        }

        int catcher = count_last(current.Get_Next(), last_data);

        if(current.Get_Data() == last_data[0])
            catcher += 1;

        return catcher;
    }

    public void remove_except()
    {
        if(head == null)
            return;
        if(head.Get_Next() == null)
            return;
        if(head.Get_Next().Get_Next() == null)
            return;

        remove_except(head);

    }

    protected int remove_except(Node current)
    {
        if(current.Get_Next() == null)
        {
            return 1;
        }

        int catcher = remove_except(current.Get_Next());

        if(catcher > 0)
        {
            head = current;
        }

        return catcher - 1;
    }

    public void copy_all(Linked_List source)
    {
        if(source.head == null)
        {
            head = null;
            return;
        }

        Node temp = null;
        head = copy_all(source.head, temp);

    }

    protected Node copy_all(Node source, Node dest)
    {
        if(source == null)
        {
            return null;
        }

        Node temp = copy_all(source.Get_Next(), dest);
        dest = new Node();
        dest.Set_Data(source.Get_Data());
        dest.Set_Next(temp);

        return dest;
    }
}
