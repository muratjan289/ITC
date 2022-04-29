package Practik;
import java.util.Arrays;

public class DescendingOrder {


    public static int sortDesc(final int num) {

        Integer a = num;
        String str;
        char b ;
        String result;

        str = a.toString();
        char[] arr = str.toCharArray();


        for (int i = 0; i < arr.length; i++){
            char min = arr[i];
            int index = i;
            for ( int j = i + 1; j < arr.length; j++){
                if (arr[j] > min){
                    min = arr [j];
                    index  =j;
                }
            }

            if (i != index){
                b = arr[i];
                arr[i] = min;
                arr[index] = b;
            }
        }

        result = new String (arr);
        a = Integer.parseInt(result);
        System.out.println("Результат:  " + a);
        return num;

    }
}



class sortTest {
    public static void main(String[] args) {

        System.out.println("Число для сортировки:  "+ DescendingOrder.sortDesc(150654123));

    }
}

