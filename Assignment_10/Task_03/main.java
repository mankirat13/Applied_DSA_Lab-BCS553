// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 10, Task 3
// Question: Create class Person with field name and method greet()
// that prints "Hello," followed by the name. Create class Teacher
// extending Person with no other code. In main, create a Teacher,
// set its name to Kiran and call greet().

class Person {
    String name;

    void greet() {
        System.out.println("Hello, " + name);
    }
}

class Teacher extends Person {
}

public class main {
    public static void main(String[] args) {
        Teacher t = new Teacher();
        t.name = "Kiran";
        t.greet();
    }
}