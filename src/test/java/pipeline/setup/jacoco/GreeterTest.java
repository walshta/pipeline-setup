package pipeline.setup.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    public void testDefaultGreeting(){
        final String defaultGreeting = "Hello World!";
        Greeter greeter = new Greeter();
        String greeting = greeter.greet();

        assertEquals(defaultGreeting, greeting);
    }

    @Test
    public void testNonDefaultGreeting() {
        final String greeting = "Goodbye cruel";
        Greeter greeter = new Greeter(greeting);

        assertEquals(greeting.concat(" World!"), greeter.greet());
    }

    @Test
    public void testChangingGreeting() {
        final String defaultGreeting = "Hello World!";
        final String greeting = "Goodbye cruel";
        Greeter greeter = new Greeter();

        assertEquals(defaultGreeting, greeter.greet());

        greeter.setGreeting(greeting);

        assertEquals(greeting.concat(" World!"), greeter.greet());
    }

    @Test
    public void testGetGreeting() {
        final String defaultGreeting = "Hello";
        final String greeting = "Goodbye";
        Greeter greeter = new Greeter();

        assertEquals(defaultGreeting, greeter.getGreeting());

        greeter.setGreeting(greeting);

        assertEquals(greeting, greeter.getGreeting());
    }
}