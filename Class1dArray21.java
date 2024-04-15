import java.util.Arrays;

/**
 * Class1dArray21
 */
public class Class1dArray21 {

    public static int[] sortingArray(int[] array) {
        Arrays.sort(array);
        return array;
    }

    public static int BiggestValue(int[] array) {
        return array[array.length-1];
    }

    public static int BiggestValueCount(int[] array, int target) {
        int count = 0;
        for(int num : array) {
            if (num == target) {
                count++;
            }
        }
        return count;
    }

    public static int BiggestValuePosition(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1;
    }
}