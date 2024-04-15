/**
 * SearchStudent21
 */
public class SearchStudent21 {

    Students21[] listStd = new Students21[5];
    int idx;

    public SearchStudent21(int size) {
        listStd = new Students21[size];
        idx = 0;
    }

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

    public int findSeqSearchByName(String searchName) {
        int position = -1;
        for (int i = 0; i < listStd.length; i++) {
            if (listStd[i].name.equalsIgnoreCase(searchName)) {
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

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listStd[mid].nim) {
                return (mid);
            } else if (listStd[mid].nim > cari) {
                return FindBinarySearch(cari, left, mid - 1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
    
}