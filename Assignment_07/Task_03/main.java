// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 7, Task 3
// Question: Use a for loop to multiply all the values of {2, 3, 4}
// and print the product as "Product:" followed by the number.

public class main {
    public static void main(String[] args) {
        int[] a = {2, 3, 4};
        int product = 1;

        for (int i = 0; i < a.length; i++) {
            product = product * a[i];
        }

        System.out.println("Product: " + product);
    }
}