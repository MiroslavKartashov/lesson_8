//3.Дан массив целых чисел и ещё одно целое число. Удалите все вхождения этого числа из массива (пропусков быть не должно)
import java.util.Arrays;

public class ArrDel {
    public static void main(String[] args) {
        int array1[] = {0, 1, 2, 2, 7, 3, 0, 7, 4, 2, 5, 9, 7, 2 ,2 ,2};
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(removeElement(array1, 2)));
    }
    public static int[] removeElement(int[] array2, int val) {
        int offset = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i] == val) {
                offset++;
            } else {
                array2[i - offset] = array2[i];
            }
        }
        return Arrays.copyOf(array2, array2.length - offset);
    }
}