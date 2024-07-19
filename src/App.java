public class App {
    private Greet greet;
    App(Greet greet) {
        this.greet = greet;
    }

    public void say() {
        this.greet.greet();
    }
}
