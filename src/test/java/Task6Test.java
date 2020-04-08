import org.junit.Test;

import static org.junit.Assert.*;

public class Task6Test {

    @Test
    public void earthAndRope() {
        assertEquals(6378100.078, Task6.earthAndRope(6378.1, 1), 0.001);
    }

    @Test
    public void pool() {
        assertEquals(72256.631, Task6.pool(1000, 2000, 1, 3), 0.001);
    }
}