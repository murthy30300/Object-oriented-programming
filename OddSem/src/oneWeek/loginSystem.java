package oneWeek;

class Logger {

    private static Logger instance = null;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }

    public void log(String message) {
        System.out.println(message);
    }
}

public class loginSystem {

    public static void main(String[] args) {
        Logger logger = Logger.getInstance();
        logger.log("YOUR LOGIN IS SUCCESSFULLY COMPLETED");
    }
}

