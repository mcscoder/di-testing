public class AppTest {
    public static void main(String[] args) {
        Greet hi = new Hi();
        Hello hello = new Hello();

        App appHi = new App(hi);
        App appHello = new App(hello);

        appHi.say(); // Output: hi
        appHello.say(); // Output: hello
    }
}
