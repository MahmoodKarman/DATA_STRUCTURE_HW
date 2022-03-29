package MYLab1;
import java.util.Random;
/**
 * Created by MAHMOOD on 1/30/2022.
 */
public class M3 {
        public static void main(String[] args) {
            int[] array = { 10, 20, 30, 40, 50, 60, 70, 80, 90,100 };
            removeElements(array);
        }
        static void removeElements(int[] array) {
            Random r = new Random();
            while (array.length > 0) {
                int index = r.nextInt(array.length);
                System.out.println("INDEX = " + index + ", ELEMENT = " + array[index]);
                int[] array1 = new int[array.length - 1];
                for (int i = 0; i < index; i++)
                    array1[i] = array[i];
                for (int i = index; i < array.length - 1; i++)
                    array1[i] = array[i + 1];
                array = array1;
            }}}


