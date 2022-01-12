package week3.task4and5;

import week3.task4and5.Rectangle;
import week3.task4and5.Square;

public class Task4 {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(4,7);
        rectangle.area();
        rectangle.perimeter();

        Square square = new Square(7);
        square.area();
        square.perimeter();

        System.out.println();

        Square[] squares = {new Square(1), new Square(2), new Square(3), new Square(4), new Square(5),
                            new Square(6), new Square(7), new Square(8), new Square(9), new Square(10)};

        for (Square sq : squares) {
           sq.area();
        }

        
    }

}
