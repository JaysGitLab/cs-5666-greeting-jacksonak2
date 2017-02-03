/**
 * Test for the Greeting v1
 * @author: Amanda Jackson
 */
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.*;

public class GreetingTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private Greeting greeting = new Greeting();
    @Test
    public void v1test() {
        PrintStream ps = new PrintStream(outContent);
        PrintStream old = System.out;
        System.setOut(ps);
        greeting.v1Greeting();
        System.out.flush();
        System.setOut(old);
        assertEquals("Hello, World.\n", outContent.toString());
    }
    
    @Test
    public void v2JayTest() {
        PrintStream ps = new PrintStream(outContent);
        PrintStream old = System.out;
        System.setOut(ps);
        greeting.v2JayGreeting();
        System.out.flush();
        System.setOut(old);
        assertEquals("Hello, Jay.\n", outContent.toString());
    }

}
