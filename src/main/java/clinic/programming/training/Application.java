package clinic.programming.training;

import java.util.ArrayList; //Implementation of the Interface
import java.util.List; //The Interface

public class Application {
    
    public void greet() {
	List<String> greetings = new ArrayList<>();
	greetings.add("Hello");
    
	for (String greeting : greetings) {
	    System.out.println("Greeting: " + greeting);
	}
    }
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	Application app = new Application();
	app.greet();
    }
}
