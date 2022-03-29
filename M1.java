package MYLab1;

/**
 * Created by MAHMOOD on 1/30/2022.
 */
public class M1 {
    static int [] MyArray = {100,200,300,400,500,600,700,800,900,1000};

    static public void Rev_Array ()
    {
        //PRINT FORM LAST ELEMENT
        System.out.println(" Array in reverse order:");
        for(int i=MyArray.length-1;i>=0;i--)
            System.out.print(MyArray[i] + "  ");
    }
    public static void main(String[] args) {

        //print FROM FRIST ELEMENT
        System.out.println("Original Array:");
        for(int i=0;i<MyArray.length;i++)
            System.out.print(MyArray[i] + "  ");

        System.out.println();
        Rev_Array();
    }
}
