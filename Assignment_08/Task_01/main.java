// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 8, Task 1
// Question: Create class Student with int roll, String name and method
// show() that prints "Roll:" and the roll, then "Name:" and the name.
// In main, create a Student with roll 5 and name Rohan and call show().

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
        Student s = new Student();
        s.roll = 5;
        s.name = "Rohan";
        s.show();
    }
}