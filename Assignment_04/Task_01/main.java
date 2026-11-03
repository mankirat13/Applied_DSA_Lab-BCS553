// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 4, Task 1
// Question: Find the index of the smallest value in the array
// {64, 25, 12, 22, 11} with a loop, and print that index.

public class main {
    public static void main(String[] args) {
        int[] a = {64, 25, 12, 22, 11};
        int minIndex = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[minIndex]) {
                minIndex = i;
            }
        }

        System.out.println(minIndex);
    }
}