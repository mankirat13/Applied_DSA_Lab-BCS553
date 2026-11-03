// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 14, Task 2
// Question: Write the method int findIndex(int[] a, int key, int i)
// that returns the index of key from index i onwards, or -1 if
// absent. Call it on {45, 67, 80, 52, 90}, key 80, i = 0, and print
// it.

public class main {
    static int findIndex(int[] a, int key, int i) {
        if (i == a.length) {
            return -1;
        }
        if (a[i] == key) {
            return i;
        }
        return findIndex(a, key, i + 1);
    }

    public static void main(String[] args) {
        int[] a = {45, 67, 80, 52, 90};
        System.out.println(findIndex(a, 80, 0));
    }
}