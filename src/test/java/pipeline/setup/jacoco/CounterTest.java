package pipeline.setup.jacoco;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

public class CounterTest {
    private Counter counter;

    @Before
    public void setup() {
        counter = new Counter();
    }

    @Test
    public void incrementWithPositive() {
        int value = 5;

        assertThat(counter.increment(value), equalTo(value));
    }

    @Test
    public void incrementWithNegative() {
        int value = -5;

        assertThat(counter.increment(value), equalTo(value));
    }

    @Test
    public void decrementWithPositive() {
        int value = 5;

        assertThat(counter.decrement(value), equalTo(-value));
    }

    @Test
    public void decrementWithNegative() {
        int value = -5;

        assertThat(counter.decrement(value), equalTo(value));
    }
}