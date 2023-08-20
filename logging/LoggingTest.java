package logging;
import java.util.logging.*;

class inter{
    @Override
    public String toString() {
        return "김민재";
    }
}
public class LoggingTest {
    public static void main(String[] args) {
        /**
         var x = new inter();
         int a = 10;
         Logger.getGlobal().info("x = " + x);
         Logger.getGlobal().info("a = " + a);
         */
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace(); // 스택 트레이스 출력
        }
    }
    public static void method1() throws Exception {
        method2();
    }
    public static void method2() throws Exception {
        throw new Exception("Custom Exception");
    }
}
