// Write a Java program to create a class called Configuration with a static block that initializes a static variable 'configValue' from a configuration file (simulated with a default value). Print the value of 'configValue' in the main method.

class Configuration {
    static int configValue ;

    static{
        configValue = 0;
    }

    static void display(){
        System.out.println("Config Value : "+ configValue);
    }

    public static void main(String[] rounak) {

        display();
        
    }
    
}
