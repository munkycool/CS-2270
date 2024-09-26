package lab3;
import balloon4.Balloon;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BalloonTest {
    private static final int maxSize = 20;
    private Balloon b;

    @BeforeEach
    public void setup() {
        b = new Balloon(maxSize);
    }

    @Test
    public void testInitial() {
        assertEquals(0, b.getRadius());
    }
    @Test
    public void testBlow() {
        b.blow(5);
        assertEquals(5, b.getRadius());
    }
    @Test
    public void testBlowTwice() {
        b.blow(5);
        b.blow(5);
        assertEquals(10, b.getRadius());
    }
    @Test
    public void canNotBlowNegative() {
        b.blow(-1);
        assertEquals(0, b.getRadius());
    }
    @Test
    public void canFillToMax() {
        b.blow(maxSize);
        assertEquals(maxSize, b.getRadius());
    }
    @Test
    public void testMaxBlow() {
        b.blow(maxSize);
        assertEquals(maxSize, b.getRadius());
    }
    @Test
    public void testOverBlow() {
        b.blow(maxSize + 1);
        assertEquals(0, b.getRadius());
    }
    @Test
    public void testIsPopped() {
        b.blow(maxSize + 1);
        assertEquals(true, b.isPopped());
    }
    @Test
    public void testPop() {
        b.blow(maxSize);
        b.pop();
        assertEquals(true, b.isPopped());
    }
    @Test
    public void testDeflate() {
        b.blow(maxSize);
        b.deflate();
        assertEquals(0, b.getRadius());
    }
    @Test
    public void testDeflateIsNotPopped() {
        b.blow(maxSize);
        b.deflate();
        assertEquals(false, b.isPopped());
    }
    @Test
    public void testPoppedHasZeroRadius() {
        b.blow(maxSize + 1);
        assertEquals(0, b.getRadius());
    }
    @Test
    public void blowAfterPop() {
        b.blow(maxSize);
        b.pop();
        b.blow(5);
        assertEquals(0, b.getRadius());
    }
}

