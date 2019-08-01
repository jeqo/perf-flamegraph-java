package io.github.jeqo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        App app = new App();
        app.awesomeFunction();
    }

    private void awesomeFunction() {
        int x = 0;
        while (true) {
            x = x + 1;
        }
    }
}
