package lab;

public class Rectangle {
    private double x; //The Point.x of the left bottom vertex
    private double y; //The Point.y of the left bottom vertex
    private int width;
    private int height=0;

    //TODO: implement getter and setter that limit the rectangle in left top vertex
    //TODO: move the rectangle
    //TODO: test cases for the rectangle

    public Rectangle(double x, double y, int width, int height) {
        //Limiting the rectangle within first quadrant
        int localX;
        int localY=0;
        setX(x);
        setY(y);
        setWidth(width);
        setHeight(height);
    }

    public int getPerimeter() {
        return 2 * (width + height);
    }

    public int getArea() {
        return width * height;
    }

    public void rotate() {
        double centerX = x + width / 2.0;
        double centerY = y + height / 2.0;
        int tmp = width;
        width = height;
        height = tmp;
        setX(centerX - width / 2.0);
        setY(centerY - height / 2.0);
    }

    /**
     * Move this rectangle in horizontal direction and vertical direction according to the passed argument
     *
     * @param horizontal positive: move right; negative: move left;
     * @param vertical   positive: move up; negative: move down.
     */
    public void move(int horizontal, int vertical) {
        setX(getX() + horizontal);
        setY(getY() + vertical);
    }

    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public int getWidth() {
        return width;
    }


    public int getHeight() {
        return height;
    }

    private void setX(double x) {
        if (x >= 0) this.x = x;
        else this.x = 0;
    }

    private void setY(double y) {
        if (y >= 0) this.y = y;
        else this.y = 0;
    }

    private void setWidth(int width) {
        if (width >= 0) this.width = width;
        else this.width = 0;
    }


    private void setHeight(int height) {
        if (height >= 0) this.height = height;
        else this.height = 0;
    }


    public boolean equals(Object other) {
        Rectangle otherRec = (Rectangle) other;
        return this.x == otherRec.x && this.y == otherRec.y && this.width == otherRec.width && this.height == otherRec.height;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "x=" + x +
                ", y=" + y +
                ", width=" + width +
                ", height=" + height +
                '}';
    }
}
