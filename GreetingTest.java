/**
 * Test for the Greeting v1
 * @author: Amanda Jackson
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

public class GreetingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Test
    public void out() {
        PrintStream ps = new PrintStream(outContent);
        PrintStream old = System.out;
        System.setOut(ps);
        Greeting greeting = new Greeting();
        System.out.flush();
        System.setOut(old);
        assertEquals("Hello, World.\n", outContent.toString());
    }
}
