/**
 * SearchStudent21
 */
public class SearchStudent21 {

    Students21[] listStd = new Students21[5];
    int idx;

    public void add(Students21 std) {
        if (idx < listStd.length) {
            listStd[idx] = std;
            idx++;
        } else {
            System.out.println("Data is already full");
        }
    }

    public void display() {
        for (Students21 students21 : listStd) {
            students21.display();
            System.out.println("------------------------------------");
        }
    }

    public int findSeqSearch(int search) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].nim == search) {
                position = i;
                break;
            }
        }
        return position;
    }

    public void showPosition(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data : " + x + " is foud in index-"+pos);
        } else {
            System.out.println("Data : " + x + " is not found");
        }
    }

    public void showData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM \t  : " + x);
            System.out.println("Name \t : " + listStd[pos].name);
            System.out.println("Age \t  : " + listStd[pos].age);
            System.out.println("IPK \t  : " + listStd[pos].gpa);
        } else {
            System.out.println("Data " + x + " is not found");  
        }
    }

    
}