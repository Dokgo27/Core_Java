package logging;
import java.util.logging.*;

public class SocketHandlerExample {
    public static void main(String[] args) throws Exception {
        Logger logger = Logger.getLogger("SocketHandlerExample");

        // Create a SocketHandler with the specified host and port
        SocketHandler socketHandler = new SocketHandler("localhost", 9876);

        // Set the formatter for the SocketHandler
        socketHandler.setFormatter(new SimpleFormatter());

        // Add the SocketHandler to the logger
        logger.addHandler(socketHandler);

        // Log messages
        logger.info("This is an informational message.");
        logger.warning("This is a warning message.");
        logger.severe("This is a severe message.");
    }
}
