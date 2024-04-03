package pk.edu.cuiatd.configuration;

public class Demo {

    public static void main(String[] args) {
        // Invoke Configuration.getInstance() to get the configuration instance
        Configuration config = Configuration.getInstance();
        
        // Retrieve and print configuration values
        System.out.println("Mode: " + config.getValue("mode"));
        System.out.println("Font Size: " + config.getValue("font-size"));
        System.out.println("Font Type: " + config.getValue("font-type"));
    }
}
