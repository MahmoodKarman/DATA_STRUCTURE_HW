package lab5;


public class lab5_2 {
    lab5_2 head;

    public void addToTheLast(Lab5 node)
    {
        if (head == null)
        {
            head = node;
        }
        else
        {
            Lab5 temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }

    void printList()
    {
        Lab5 temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String args[])
    {

        lab5_2 llist1 = new lab5_2();
        lab5_2 llist2 = new lab5_2();

        llist1.addToTheLast(new Lab5(1));
        llist1.addToTheLast(new Lab5(3));
        llist1.addToTheLast(new Lab5(6));

        llist2.addToTheLast(new Lab5(2));
        llist2.addToTheLast(new Lab5(4));
        llist2.addToTheLast(new Lab5(5));


        llist1.head = new To_Sort().sortedMerge(llist1.head,
                llist2.head);
        System.out.print("After Merged :");
        llist1.printList();


    }
}

class To_Sort
{

    Lab5 sortedMerge(Lab5 headA, Lab5 headB)
    {

        Lab5 dummyNode = new Lab5(0);
        
        Lab5 tail = dummyNode;
        while(true)
        {

            if(headA == null)
            {
                tail.next = headB;
                break;
            }
            if(headB == null)
            {
                tail.next = headA;
                break;
            }

            if(headA.data <= headB.data)
            {
                tail.next = headA;
                headA = headA.next;
            }
            else
            {
                tail.next = headB;
                headB = headB.next;
            }

            tail = tail.next;
        }
        return dummyNode.next;
    }
}
