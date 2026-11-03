// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 7, Task 2
// Question: Sort the array {3, 1, 2} with bubble sort and print each
// value of the sorted array on its own line.

public class main {
    public static void main(String[] args) {
        int[] a = {3, 1, 2};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}