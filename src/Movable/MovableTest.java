package Movable;

public class MovableTest
{
    public MovableTest()
    {
        //test Circle
        MovableCircle circle1 = new MovableCircle(10,15,5,3,2);
        System.out.println(circle1.toString());
        circle1.moveDown();
        System.out.println(circle1.toString());
        circle1.moveRight();
        System.out.println(circle1.toString());

        //test Rectangle
        MovableRectangle rectangle1 = new MovableRectangle(10,10,20,20,2,5);
        System.out.println(rectangle1.toString());
        rectangle1.moveUp();
        System.out.println(rectangle1.toString());
        rectangle1.moveLeft();
        System.out.println(rectangle1.toString());
    }
}
