package logging;

import java.util.logging.*;
class CustomFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        String level = record.getLevel().toString();
        String message = record.getMessage();
        String formattedMessage = String.format("[%s] %s%n", level, message);
        return formattedMessage;
    }
}
public class FormatterExample {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("FormatterExample");

        // Create a CustomFormatter
        CustomFormatter customFormatter = new CustomFormatter();

        // Create a ConsoleHandler and set its formatter
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setFormatter(customFormatter);

        // Add the ConsoleHandler to the logger
        logger.addHandler(consoleHandler);

        // Log messages
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe message.");
    }
}

