package pipeline.setup;

import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@Category(Unit.class)
public class AppTest {

    @Test
    public void testDefaultGreeting(){
        final String defaultGreeting = "Hello World!";
        App app = new App();
        String greeting = app.greet();
        assertThat(greeting, equalTo(defaultGreeting));
    }

    @Test
    public void testNonDefaultGreeting() {
        final String greeting = "Goodbye cruel";
        App app = new App(greeting);

        assertThat(app.greet(), equalTo(greeting.concat(" World!")));
    }

    @Test
    public void testChangingGreeting() {
        final String greeting = "Goodbye cruel";
        App app = new App();
        app.setGreeting(greeting);

        assertThat(app.greet(), equalTo(greeting.concat(" World!")));
    }
}