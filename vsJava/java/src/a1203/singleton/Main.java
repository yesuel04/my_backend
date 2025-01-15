package a1203.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonLogger logger = SingletonLogger.getInstance();
        logger.log("This is a log message");

        SingletonLogger anthorLogger = SingletonLogger.getInstance();
        anthorLogger.log("This is a log message");

        if(logger == anthorLogger){
            System.out.println("Both logger instance are the same.");
        }
    }
}
