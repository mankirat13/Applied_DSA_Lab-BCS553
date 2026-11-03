// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 9, Task 2
// Question: Create class Box with int field width and a constructor
// that takes an int and sets width using this.width. In main, create
// a Box width 25 and print "Width:" followed by the value.

class Box {
    int width;

    Box(int width) {
        this.width = width;
    }
}

public class main {
    public static void main(String[] args) {
        Box b = new Box(25);
        System.out.println("Width: " + b.width);
    }
} 