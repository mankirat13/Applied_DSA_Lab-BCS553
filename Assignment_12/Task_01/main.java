// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 12, Task 1
// Question: Write the method int factorial(int n) using recursion.
// The factorial of 0 is 1, and n times factorial(n - 1) is the other
// case. Print factorial(5).

public class main {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}