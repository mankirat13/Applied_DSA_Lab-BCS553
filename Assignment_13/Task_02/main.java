// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 13, Task 2
// Question: Write the method int max(int[] a, int i) that returns the
// largest value from index i to the end. Call it on
// {3, 6, 9, 12, 15} with i = 0 and print the result.

public class main {
    static int max(int[] a, int i) {
        if (i == a.length - 1) {
            return a[i];
        }
        int rest = max(a, i + 1);
        if (a[i] > rest) {
            return a[i];
        }
        return rest;
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(max(a, 0));
    }
}