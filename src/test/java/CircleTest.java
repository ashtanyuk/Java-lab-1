import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {

    @Test
    public void setRadius() {
        Circle circle = new Circle(1);
        circle.setRadius(3);
        assertEquals(18.84, circle.getFerence(), 0.01);
    }

    @Test
    public void setFerence() {
        Circle circle = new Circle(2);
        circle.setFerence(6.28);
        assertEquals(3.14, circle.getArea(), 0.01);
    }

    @Test
    public void setArea() {
        Circle circle = new Circle(1);
        circle.setArea(314);
        assertEquals(10, circle.getRadius(), 0.01);
    }
}