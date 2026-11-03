// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 7, Task 4
// Question: Use a for loop and an if statement to print each even
// value in {1, 2, 3, 4}, one per line. A value is even when
// value % 2 is 0.

public class main {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println(a[i]);
            }
        }
    }
}