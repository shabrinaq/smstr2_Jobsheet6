import java.util.Scanner;

/**
 * StudentsMain21
 */
public class StudentsMain21 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);

        SearchStudent21 data = new SearchStudent21();
        int amountStudent = 5;

        System.out.println("--------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-------------------");
            System.out.print("NIM\t:");
            int nim = s.nextInt();
            s.nextLine();
            System.out.print("Name\t:");
            String name = s.nextLine();
            System.out.print("Age\t:");
            int age = s.nextInt();
            System.out.print("GPA\t:");
            double gpa = s.nextDouble();

            Students21 std = new Students21(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("--------------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("-------------------");
        System.out.println("-------------------");
        System.out.print("Search student by NIM: ");
        int search = s.nextInt();
        System.out.println("Using Sequential Search");
        int position = data.findSeqSearch(search);

        data.showPosition(search, position);

        data.showData(search, position);  
    }
}