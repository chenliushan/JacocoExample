package lab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class RectangleTest {
    Rectangle rectangle;
    @Before
    public void before(){
        rectangle=new Rectangle(4,5,6,7);
    }
    @Test
    public void move() throws Exception {

        rectangle.move(-3,6);
        Assert.assertEquals(1,rectangle.getX(),0);
        Assert.assertEquals(11,rectangle.getY(),0);
        Assert.assertEquals(6,rectangle.getWidth(),0);
        Assert.assertEquals(7,rectangle.getHeight(),0);
        Rectangle rectangleB=new Rectangle(0,0,6,7);
        rectangle.move(-39,-20);
        Assert.assertEquals(rectangle, rectangleB);

    }

    @Test
    public void testSame() throws Exception {
        Rectangle rectangleA=new Rectangle(0,0,6,7);
        Rectangle rectangleB=new Rectangle(0,0,6,7);

        Assert.assertEquals(rectangleA,rectangleB);
//        Assert.assertSame(rectangleA,rectangleB);
    }

    @Test
    public void rotate() throws Exception {
        rectangle.rotate();
        Assert.assertEquals(3.5,rectangle.getX(),0);
        Assert.assertEquals(5.5,rectangle.getY(),0);
        Assert.assertEquals(7,rectangle.getWidth(),0);
        Assert.assertEquals(6,rectangle.getHeight(),0);

        Rectangle rectangleB=new Rectangle(1,2,6,9);
        rectangleB.rotate();
        Assert.assertEquals(0,rectangleB.getX(),0);
        Assert.assertEquals(3.5,rectangleB.getY(),0);
        Assert.assertEquals(9,rectangleB.getWidth(),0);
        Assert.assertEquals(6,rectangleB.getHeight(),0);
    }
}