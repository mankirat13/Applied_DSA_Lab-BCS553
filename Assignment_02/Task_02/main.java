// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 2, Task 2
// Question: Create the array int[] marks = {45, 67, 80, 52, 90}.
// Find the smallest value with a loop and print it as "Smallest:"
// followed by the value.

public class main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int smallest = marks[0];

        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < smallest) {
                smallest = marks[i];
            }
        }

        System.out.println("Smallest: " + smallest);
    }
}