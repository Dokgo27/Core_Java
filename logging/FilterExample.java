package logging;

import java.util.logging.*;

class CustomFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord record) {
        String message = record.getMessage();
        return message != null && (message.startsWith("ENTER") || message.startsWith("RETURN"));
    }
}

public class FilterExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("FilterExample");

        // Create a custom filter
        CustomFilter customFilter = new CustomFilter();

        // Set the filter for the logger
        logger.setFilter(customFilter);

        // Create a ConsoleHandler and set its formatter
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(new SimpleFormatter());

        // Add the ConsoleHandler to the logger
        logger.addHandler(consoleHandler);

        // Log messages
        logger.info("ENTER: Entering method.");
        logger.info("INFO: This is a regular message.");
        logger.info("RETURN: Exiting method.");
    }
}

