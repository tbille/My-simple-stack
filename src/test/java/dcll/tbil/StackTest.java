package dcll.tbil;

import org.junit.Test;

import java.util.EmptyStackException;

import static org.junit.Assert.*;

/**
 * Created by tbmb on 24/02/16.
 */
public class StackTest {

    @Test
    public void testCreateEmptyStack() { // Test case

        // Code under test
        SimpleStack stack = new Stack();

        // Assertions (oracle)
        assertTrue("A new stack should be empty", stack.isEmpty());
        assertEquals("A new stack has no element", 0, stack.getSize());
    }

    @Test
    public void testPush() throws EmptyStackException {

        // Setup the "state of the world"
        SimpleStack stack = new Stack();
        Item item = new Item();

        // Code under test
        stack.push(item);

        // assertions (oracle)
        assertFalse("The stack must be not empty", stack.isEmpty());
        assertEquals("The stack contains 1 item", 1, stack.getSize());
        assertSame("The pushed item is on top of the stack", item, stack.peek());
    }

    @Test
    public void testPop() throws EmptyStackException{
        // Setup the "state of the world"
        SimpleStack stack = new Stack();
        Item item = new Item();

        // Code under test
        stack.push(item);

        assertSame("The pushed item is on top of the stack", item, stack.pop());
        assertEquals("The stack contains 1 item", 0, stack.getSize());
        assertTrue("The stack must be not empty", stack.isEmpty());
    }
}