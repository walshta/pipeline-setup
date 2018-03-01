package pipeline.setup;

public class App {
    private String greeting;

    public App() {
        greeting = "Hello";
    }

    public App(String greeting) {
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

    public static void main(String args[]) {
        App app = new App();
        System.out.println(app.greet());
        app.setGreeting("Goodbye cruel");
        System.out.println(app.greet());
    }
}
