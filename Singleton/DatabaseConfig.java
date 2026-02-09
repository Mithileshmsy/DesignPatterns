/*
* The Singleton pattern ensures that a class has only one instance and provides a global point of access to it.
* This is perfect for things like database connections or logger classes.
* */

package Singleton;

public class DatabaseConfig {
    //1.make object static and private
    private static DatabaseConfig instance;

    //2.make constructor private so we cant create object with constructor
    private DatabaseConfig(){}

    //3.create method to get instance of class
    public static DatabaseConfig getInstance(){
        if(instance == null){
            instance = new DatabaseConfig();
        }
        return instance;
    }

    //test method
    public void showMessage(){
        System.out.println("Connected to database");
    }

}
