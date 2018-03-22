package pipeline.setup.jacoco;

public class Greeter {
    private String greeting;

    public Greeter() {
        greeting = "Hello";
    }

    public Greeter(String greeting) {
        this.greeting = greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getGreeting() {
        return greeting;
    }

    public String greet() {
        return greeting.concat(" World!");
    }
}
