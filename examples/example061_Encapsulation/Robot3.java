package examples.example061_Encapsulation;

import java.util.ArrayList;

public class Robot3 {
    enum State {
        On, Off;
    }

    private static int defaultIndex;
    private static ArrayList<String> names;
    private String name;
    private int level;
    private State state;

    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

    private Robot3(String name, int level) {
        if ((name.isEmpty() || Character.isDigit(name.charAt(0))) || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        } else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    public Robot3(String name) {
        this(name, 1);
    }

    public Robot3() {
        this("");
    }

    public String getName() {
        return this.name;
    }

    public int getLevel() {
        return this.level;
    }

    public void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHI();
    }

    public void powerOff() {
        this.stopBIOS();
        this.stopOS();
        this.sayBye();
    }

    /** Работа */
    public void work() {
        System.out.println("Working...");
    }
    
    /** Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /** Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /** Приветствие */
    private void sayHI() {
        System.out.println("Hello world...");
    }

    /** Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /** Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /** Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    // Методы вкл\выкл подсистем
    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }
}
