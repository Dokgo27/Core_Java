package InnerClass;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import javax.swing.*;

class TalkingClock {
    private int interval;
    private boolean beep;

    /**
     * 대화식 시계를 구축합니다.
     * @param interval 알림 간격(밀리초 단위)
     * @param beep 시계가 소리를 내도록 할 경우 true
     */
    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    /**
     * 시계를 시작합니다.
     */
    public void start() {
        /** local class
        class TimePrinter implements ActionListener {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        }
        */
        var listener = new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }
    public class TimePrinter implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
            if (beep) Toolkit.getDefaultToolkit().beep();
        }
    }
    /** Anonymous Inner Class
    public void start(int interval, boolean beep) {
        var listener = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };
        var timer = new Timer(interval, listener);
        timer.start();
    }
     */
}
public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        // 사용자가 "OK"를 선택할 때까지 프로그램을 계속 실행합니다.
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}