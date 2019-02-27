public class HelloWorld {

    public String greet() {
        return "Hello World!";
    }

    public static void main(String[] args) {
	HelloWorld myWorld = new HelloWorld();
        System.out.println(myWorld.greet() + "\n" + myWorld.greet());
    }
}
