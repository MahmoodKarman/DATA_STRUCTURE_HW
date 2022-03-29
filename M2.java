package MYLab1;

/**
 * Created by MAHMOOD on 1/30/2022.
 */
public class M2 {
    static int MyArray[] ={1,2,3,4};

    public  void COPY_ARRAY ()
    {
        int copy_array[] = new int[MyArray.length];

        copy_array = MyArray;

        // change element of copy_array
         copy_array[3]++;

        //print both arrays
        System.out.println("\nContents of intArray[]:");
        for (int i=0; i<MyArray.length; i++)
            System.out.print(MyArray[i] + " ");
        System.out.println("\nContents of copy_array[]:");
        for (int i=0; i<copy_array.length; i++)
            System.out.print(copy_array[i] + " ");
    }
    public static void main(String[] args)
    {
        //print original intArray
        System.out.println("Contents of intArray[] before assignment:");
        for (int i=0; i<MyArray.length; i++)
            System.out.print(MyArray[i] + " ");


        M2 nam = new M2();
        nam.COPY_ARRAY();
    }
}
