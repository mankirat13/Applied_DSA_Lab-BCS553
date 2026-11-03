// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 4, Task 3
// Question: Do only the first step of selection sort on
// {64, 25, 12, 22, 11}: find the smallest value, swap it with the
// first value, and print each value of the array on its own line.

public class main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        int temp = a[0];
        a[0] = a[minIndex];
        a[minIndex] = temp;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}