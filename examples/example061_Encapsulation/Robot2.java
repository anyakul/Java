package examples.example061_Encapsulation;

public class Robot2 {
    /** Уровень робота */
    private int level;

    /** Имя робота */
    private String name;

    /**
     * Создание робота
     * @param name Имя робота Не должно начинаться с цифры
     * @param level Уровень робота
     */
    public Robot2(String name, int level) {
        this.name = name;
        this.level = level;
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
}
