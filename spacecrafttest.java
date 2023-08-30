import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class spacecrafttest {
    @Test
    public void testspacecraft() {
        spacecraft ch = new spacecraft(0, 0, 0, 'N');

        // Test:1
        assertEquals('N', ch.getDirection());
        assertEquals(0, ch.getX());
        assertEquals(0, ch.getY());
        assertEquals(0, ch.getZ());

        // Test:2
        spacecraft obj = new spacecraft(0, 0, 0, 'N');
        obj.sendCommands(new char[] { 'f', 'r', 'l', 'b', 'f', 'l' });
        assertEquals('D', ch.getDirection());
        assertEquals(0, ch.getX());
        assertEquals(1, ch.getY());
        assertEquals(1, ch.getZ());

    }
}