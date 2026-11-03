// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 9, Task 1
// Question: Create class Box with int field width and a constructor
// with no parameters that sets width to 10. In main, create a Box and
// print "Width:" followed by the value.

class Box {
    int width;

    Box() {
        width = 10;
    }
}

public class main {
    public static void main(String[] args) {
        Box b = new Box();
        System.out.println("Width: " + b.width);
    }
}