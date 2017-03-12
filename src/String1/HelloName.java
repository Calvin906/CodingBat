package String1;

/**
 * Created by Wags on 3/12/17.
 */
public class HelloName {
    public static void main(String[] args) {
        String str = "Bob";
        System.out.print(helloName(str));
    }

    /**
     * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
     * helloName("Bob") → "Hello Bob!"
     * helloName("Alice") → "Hello Alice!"
     * helloName("X") → "Hello X!"
     * @param name
     * @return
     */
    public static String helloName(String name) {
        return "Hello " + name + "!";
    }
}
