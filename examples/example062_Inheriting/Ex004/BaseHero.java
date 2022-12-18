package examples.example062_Inheriting.Ex004;

public abstract class BaseHero {
    String name;
    String hp;

    public BaseHero(String name, int hp) {
        System.out.println("Вызван BaseHero(String name, int hp)");
    }

    public BaseHero() {
        this("", 0);
        System.out.println("Вызван BaseHero()");
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }
}
