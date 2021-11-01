import java.lang.reflect.Array;
import java.util.Arrays;

public class Chapter5 {
    public static void main(String[] args) {
        int[] intArray = new int[4];
        intArray[0] = 1;
        intArray[1] = 2;
        intArray[2] = 3;
        intArray[3] = 4;

        System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2] + " " + intArray[3]);

        int[] intArray2 = new int[] {
                2, 3, 4, 5
        };

        System.out.println(intArray2[0] + " " + intArray2[1] + " " + intArray2[2] + " " + intArray2[3]);

        int[] intArray3 = {
                3, 4, 5, 6
        };

        System.out.println(intArray3[0] + " " + intArray3[1] + " " + intArray3[2] + " " + intArray3[3]);

        int[] testArray = {4, 1, 5, 3, 2};
        int[] testArray2 = null;
        int[] testArray3 = null;

        System.out.println(testArray.length);
        System.out.println(Arrays.toString(testArray));
        Arrays.sort(testArray);
        System.out.println(Arrays.toString(testArray));

        testArray2 = Arrays.copyOf(testArray, testArray.length);
        testArray3 = testArray;

        System.out.println(testArray);
        System.out.println(testArray2);
        System.out.println(testArray3);

        testArray[0] = 100;

        System.out.println(Arrays.toString(testArray));
        System.out.println(Arrays.toString(testArray2));
        System.out.println(Arrays.toString(testArray3));

        int[][] array = new int[2][3];
        array[0][0] = 1;
        array[0][1] = 2;
        array[0][2] = 3;
        array[1][0] = 4;
        array[1][1] = 5;
        array[1][2] = 6;

        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(array[0]));
        System.out.println(Arrays.toString(array[1]));
        System.out.println(array[1][2]);

        int[][] array2 = {
                {10, 20, 30},
                {40, 50, 60},
                {70, 80, 90}
        };

        System.out.println(array2.length);
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(array2[0]));
        System.out.println(Arrays.toString(array2[1]));
        System.out.println(Arrays.toString(array2[2]));
    }
}
