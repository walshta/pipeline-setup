package pipeline.setup.jacoco;

import org.junit.Test;
import pipeline.setup.App;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class GreeterTest {

    @Test
    public void testDefaultGreeting(){
        final String defaultGreeting = "Hello World!";
        Greeter greeter = new Greeter();
        String greeting = greeter.greet();
        assertThat(greeting, equalTo(defaultGreeting));
    }

    @Test
    public void testNonDefaultGreeting() {
        final String greeting = "Goodbye cruel";
        Greeter greeter = new Greeter(greeting);

        assertThat(greeter.greet(), equalTo(greeting.concat(" World!")));
    }

    @Test
    public void testChangingGreeting() {
        final String defaultGreeting = "Hello World!";
        final String greeting = "Goodbye cruel";
        Greeter greeter = new Greeter();
        assertThat(greeter.greet(), equalTo(defaultGreeting));

        greeter.setGreeting(greeting);

        assertThat(greeter.greet(), equalTo(greeting.concat(" World!")));
    }

    @Test
    public void testGetGreeting() {
        final String defaultGreeting = "Hello";
        final String greeting = "Goodbye";
        Greeter greeter = new Greeter();
        assertThat(greeter.getGreeting(), equalTo(defaultGreeting));

        greeter.setGreeting(greeting);

        assertThat(greeter.getGreeting(), equalTo(greeting));
    }
}