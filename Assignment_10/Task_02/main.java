// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 10, Task 2
// Question: Create class Person with field name, set by a constructor.
// Create class Student extending Person, whose constructor takes a
// name and calls super(name). In main, create a Student named Neha
// and print "Name:" followed by the name.

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    Student(String name) {
        super(name);
    }
}

public class main {
    public static void main(String[] args) {
        Student s = new Student("Neha");
        System.out.println("Name: " + s.name);
    }
}