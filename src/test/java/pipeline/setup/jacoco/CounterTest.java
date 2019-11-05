package pipeline.setup.jacoco;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CounterTest {
    private Counter counter;

    @BeforeEach
    public void setup() {
        counter = new Counter();
    }

    @Test
    public void incrementWithPositive() {
        int value = 5;

        assertEquals(value, counter.increment(value));
    }

    @Test
    public void incrementWithNegative() {
        int value = -5;

        assertEquals(value, counter.increment(value));
    }

    @Test
    public void decrementWithPositive() {
        int value = 5;

        assertEquals(value * -1, counter.decrement(value));
    }

    @Test
    public void decrementWithNegative() {
        int value = -5;

        assertEquals(value, counter.decrement(value));
    }
}