import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class spacecrafttest {
    @Test
    public void testspacecraft() {
        spacecraft ch = new spacecraft(0, 0, 0, 'N');

        // Test:1
        assertEquals('N', ch.getdir());
        assertEquals(0, ch.getX());
        assertEquals(0, ch.getY());
        assertEquals(0, ch.getZ());

        // Test:2
        spacecraft obj = new spacecraft(0, 0, 0, 'N');
        obj.sendorders(new char[] { 'b', 'l', 'f', 'r', 'l' });

        assertEquals('W', obj.getdir());
        assertEquals(1, obj.getX());
        assertEquals(-1, obj.getY());
        assertEquals(0, obj.getZ());

        spacecraft obj2 = new spacecraft(0, 0, 0, 'N');
        obj2.sendorders(new char[] { 'l', 'r', 'u', 'd', 'f' });
        assertEquals('D', obj2.getdir());
        assertEquals(0, obj2.getX());
        assertEquals(0, obj2.getY());
        assertEquals(1, obj2.getZ());

        spacecraft obj3 = new spacecraft(0, 0, 0, 'N');
        obj3.sendorders(new char[] { 'b', 'r', 'f', 'l', 'd' });
        assertEquals('D', obj3.getdir());
        assertEquals(1, obj3.getX());
        assertEquals(-1, obj3.getY());
        assertEquals(0, obj3.getZ());

    }
}