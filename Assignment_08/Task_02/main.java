// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 8, Task 2
// Question: Create class Student with int roll, String name and method
// show() that prints "Roll:" and the roll, then "Name:" and the name.
// Create two Students: roll 5 named Rohan, and roll 8 named Meera.
// Call show() on each.

class Student {
    int roll;
    String name;

    void show() {
        System.out.println("Roll: " + roll);
        System.out.println("Name: " + name);
    }
}

public class main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 5;
        s1.name = "Rohan";

        Student s2 = new Student();
        s2.roll = 8;
        s2.name = "Meera";

        s1.show();
        s2.show();
    }
}