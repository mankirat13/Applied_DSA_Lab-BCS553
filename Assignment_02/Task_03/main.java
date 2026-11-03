// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 2, Task 3
// Question: Create the array int[] marks = {45, 67, 80, 52, 90}.
// Count the values greater than 60 and print the count as "Count:"
// followed by the number.

public class main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int count = 0;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > 60) {
                count++;
            }
        }

        System.out.println("Count: " + count);
    }
}