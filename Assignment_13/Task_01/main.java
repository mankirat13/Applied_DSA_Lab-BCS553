// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 13, Task 1
// Question: Write the method int sum(int[] a, int i) that returns the
// sum of the values from index i to the end. Call it on
// {3, 6, 9, 12, 15} with i = 0 and print the result.

public class main {
    static int sum(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        return a[i] + sum(a, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 9, 12, 15};
        System.out.println(sum(a, 0));
    }
}