public class Letter {
    // instance variables
    String letterWriter;

    // constructor; since there are no instance variables to initialize,
    // this constructor has no parameters and has an empty body: { }
    public Letter(String writer) {
        letterWriter = writer;
    }
    
    /* add your writeLetter method here: TO BE IMPLEMENTED IN #4 */
    public void writeLetter(String name) {
        greeting(name);
        specialMessage();
        closing();
    }

    public void greeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public void specialMessage() {
        System.out.println("Java is pretty cool, wouldn't you say?");
    }

    public void closing() {
        System.out.println("See you later!");
        System.out.println("From, " + letterWriter);
    }
}

