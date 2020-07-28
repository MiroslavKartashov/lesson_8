import java.util.Random;

//1.Заполните массив случайным числами и выведете максимальное, минимальное и среднее значение.
public class ArrMinMax {

    public static void main(String[] args) {
        Random rand = new Random();
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] =  Math.random();
        }
        double max = array[0];
        double min = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if(max < array[i]) {
                max = array[i];
            }
            if(min > array[i]) {
                min = array[i];
            }
            average += array[i]/array.length;
        }

        System.out.println(array.length);
        System.out.println("max = " + max);
        System.out.println("min = " + min);
        System.out.println("avg = " + average);

//2.Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
        for(int i = 2; i <= 100; i ++){
            boolean prostoe = true;

            for(int j = 2; j < i; j++){
                if(i % j == 0){
                    prostoe = false;
                    break;
                }
            }

            if(prostoe){
                System.out.println("Вот они простые  " + i );
            }
         }


    }

}
