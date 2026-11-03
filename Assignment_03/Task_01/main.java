// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 3, Task 1
// Question: Run one pass of bubble sort on {5, 1, 4, 2, 8}.
// In the pass, compare each value with the next and swap when the
// left one is larger. Print each value of the array on its own line.

public class main {
    public static void main(String[] args) {
        int[] a = {5, 1, 4, 2, 8};

        for (int j = 0; j < a.length - 1; j++) {
            if (a[j] > a[j + 1]) {
                int temp = a[j];
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}