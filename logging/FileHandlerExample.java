package logging;

import java.util.logging.*;

public class FileHandlerExample {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("FileHandlerExample");

        // Create a FileHandler with custom log file name and limit
        FileHandler fileHandler = new FileHandler("mylog.log", 5000, 3, true);

        // Set the formatter for the FileHandler
        fileHandler.setFormatter(new SimpleFormatter());

        // Add the FileHandler to the logger
        logger.addHandler(fileHandler);

        // Log messages
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe message.");
    }
}

