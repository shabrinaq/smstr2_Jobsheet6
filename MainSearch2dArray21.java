import java.util.Scanner;

/**
 * MainSearch2dArray21
 */
public class MainSearch2dArray21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] array2d = {
            {45,78,7,200,80},
            {90,1,17,100,50},
            {21,2,40,18,65}
        };

        System.out.print("Enter the element you want to search for: ");
        int search = sc.nextInt();
        System.out.println("======================================================");

        boolean found = Search2dArray21.sequentialSearch2d(array2d, search);

        if (found) {
            System.out.println("element " + search + " found in the 2d array!");
        } else {
            System.out.println("element " + search + " not found in the 2d array!");
        }
        System.out.println("-----------------------------------------");
    }
}