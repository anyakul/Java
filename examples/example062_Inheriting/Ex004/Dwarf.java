package examples.example062_Inheriting.Ex004;

public class Dwarf extends Druid {
    
    public Dwarf(String name, int hp) {
        super();
        System.out.println("Вызван Dwarf(String name, int hp)");
    }

    public Dwarf() {
        this("1", 0);
        System.out.println("Вызван Dwarf()");
    }
   
}