package Movable;

public class MovableRectangle implements Movable
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed)
    {
        topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
    }


    public String toString()
    {
        return "MovableRectangle{" +
                "topLeft x=" + topLeft.x + ", " +
                "topLeft x="+ topLeft.y+
                ", bottomRight x=" + bottomRight.x + ", " +
                "bottomRight y="+bottomRight.y+
                '}';
    }


    public void moveUp()
    {
        topLeft.moveUp();
        bottomRight.moveUp();
    }


    public void moveDown()
    {
        topLeft.moveDown();
        bottomRight.moveDown();
    }


    public void moveLeft()
    {
        topLeft.moveLeft();
        bottomRight.moveLeft();
    }


    public void moveRight()
    {
        topLeft.moveRight();
        bottomRight.moveRight();
    }
}
