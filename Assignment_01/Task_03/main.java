// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 1, Task 3
//Task : 3.  Create the array int[] marks = {45, 67, 80, 52, 90}. 
//Add all the values with a loop and print the total as 
//Sum: followed by the total.
public class main {
    public static void main(String[] args) {
        int[] marks = {45, 67, 80, 52, 90};
        int sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum = sum + marks[i];
        }

        System.out.println("Sum: " + sum);
    }
}