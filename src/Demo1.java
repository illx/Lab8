public class Demo1
{
    public static void main(String[] args){
        Linked_List object1 = new Linked_List();
        object1.build();
        object1.display();
        //object1.reverse();
        //object1.display();

        //int catcher = object1.count_last();
        //System.out.println("Last data appears " + catcher + " times in list");

        //System.out.println("Displaying list with all but last two removed\n");
        //object1.remove_except();
        //object1.display();

        Linked_List object2 = new Linked_List();
        object2.copy_all(object1);
        System.out.println("Displaying copied list\n");
        object2.display();


    }

}
