// package week3_objects;

/**
 * singletonClass
 */
class Logger{
    private static Logger instance;
    public static Logger getInstance(){
        if(instance == null){
            instance = new Logger();
        }
        return instance;
    }
    public void log(String message){
        System.out.println("Log: " + message);
    }
}

public class singletonClass {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger.log("Hello");
        logger2.log("another logger");
        System.out.println((logger == logger2));
    }
}