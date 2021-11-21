import java.util.Arrays;

public class GBDZ3 {

     static int[] change(int[] array01) {
        for (int i = 0; i < array01.length; i++) {
            array01[i] = (array01[i] == 0) ? 1 : 0;
        }
        return array01;
    }

     static int[] fill(int[] array02) {
        for (int i = 0; i < 100; i++) {
            array02[i] = i + 1;
        }
        return array02;
    }

     static int[] x2(int[] array03) {
        for (int i = 0; i < array03.length; i++) {
            if (array03[i] < 6) {
                array03[i] *= 2;
            }
        }
        return array03;
    }

    static int[] createAndFillArray(int len, int initialValue) {
         int[] arr = new int[len];
         Arrays.fill(arr, initialValue);
         return arr;
    }

    public static void createSquareArray04(int size) {
        int[][] array04 = new int[size][size];
        for (int i = 0; i < size; i++) {
            array04[i][i] = 1;
            array04[i][size - i -1] = 1;
            for (int j = 0; j < size; j++) {
                System.out.print((array04[i][j] + " "));
            }
            System.out.println();
        }
    }

    public static void main (String[] args){
        int[] array01 = {1, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(change(array01)));

        int[] array02 = new int[100];
        System.out.println(Arrays.toString(fill(array02)));

        int[] array03 =  {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println(Arrays.toString(x2(array03)));

        createSquareArray04(5);

        int[] array05 = createAndFillArray(5,23);
        System.out.println(Arrays.toString(array05));

    }
}