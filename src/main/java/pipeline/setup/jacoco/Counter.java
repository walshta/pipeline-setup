package pipeline.setup.jacoco;

public class Counter {
    private int counter;

    public Counter() {
        counter = 0;
    }

    public int increment(int amount) {
        if(amount < 0) {
            return decrement(Math.abs(amount));
        }

        return counter += amount;
    }

    public int decrement(int amount) {
        if(amount < 0) {
            return increment(amount);
        }

        return counter -= amount;
    }
}
