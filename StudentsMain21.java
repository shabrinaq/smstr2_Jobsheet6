import java.util.Scanner;

/**
 * StudentsMain21
 */
public class StudentsMain21 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        
        MergeSorting21 sorting = new MergeSorting21();

        System.out.print("Enter the number of students: ");
        int amountStudent = 3;
        s.nextLine();
        
        SearchStudent21 data = new SearchStudent21(amountStudent);
        int[] listNIM = new int[amountStudent];

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

        sorting.MergeSorting(listNIM);

        System.out.println("--------------------------------------");
        System.out.println("Entire Student Data");
        data.display();

        System.out.println("-------------------");
        System.out.println("===================");
        System.out.print("Search student by Name: ");
        String searchName = s1.nextLine();
        int position1 = data.findSeqSearchByName(searchName);
        
        if (position1 != -1) {
            System.out.println("Using Sequential Search");
            System.out.println("Data : " + searchName + " is found in index -" + position1);
            data.listStd[position1].display();
        }else {
            System.out.println("using Sequential Search");
            System.out.println("Data : " + searchName + " is not found");     
        }
    }
}
