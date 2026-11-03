// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 5, Task 3
// Question: Count how many times the value 52 appears in the array
// {52, 10, 52, 7, 52}. Print the count as "Count:" followed by
// the number.

public class main {
    public static void main(String[] args) {
        int[] a = {52, 10, 52, 7, 52};
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 52) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}