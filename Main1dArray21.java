import java.util.Scanner;

/**
 * Main1dArray21
 */
public class Main1dArray21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = {12,17,2,1,70,50,90,17,2,90};
        int[] sortArray = Class1dArray21.sortingArray(array);

        System.out.println("Sort Array");
        System.out.println("===================================");

        for(int num : sortArray) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("------------------------------------");


        int Biggest = Class1dArray21.BiggestValue(sortArray);
        int countBiggest = Class1dArray21.BiggestValueCount(sortArray, Biggest);
        int positionBiggest = Class1dArray21.BiggestValuePosition(sortArray, Biggest);

        System.out.println("Biggest Value: " + Biggest);
        System.out.println("Possition of Biggest Value: " + positionBiggest);
        System.out.println("Amount of Biggest Value: " + countBiggest);

        System.out.println("------------------------------------");
    }
}