// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 7, Task 1
// Question: Search for the value 52 in the array {45, 52, 80} with a
// loop. If 52 is there, print "Found at index" followed by a space
// and the index. If it is not there, print "Not found".

public class main {
    public static void main(String[] args) {
        int[] a = {45, 52, 80};
        int index = -1;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
}