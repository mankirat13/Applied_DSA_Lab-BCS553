// Name: Mankirat Singh
// ID: BCS2024542
// Roll No: 24103032571
// Assignment 11, Task 3
// Question: Create class Shape with int area() returning 0, class
// Square extending Shape with int side, area() returning side times
// side. In main, create Square with side 3, store it in a Shape
// variable and print "Area:" followed by the value.

class Shape {
    int area() {
        return 0;
    }
}

class Square extends Shape {
    int side;

    @Override
    int area() {
        return side * side;
    }
}

public class main {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 3;

        Shape s = sq;
        System.out.println("Area: " + s.area());
    }
}