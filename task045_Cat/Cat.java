package task045_Cat;


import java.lang.reflect.Field;

public class Cat {
    String name;
    Integer age;
    String color;

    Cat(String n) {
        name = n;
        age = 0;
        color = "gray";
    }

    Cat(String n, Integer k) {
        name = n;
        age = k;
        color = "gray";
    }

    Cat() {
        name = "Vasya";
        age = 0;
        color = "gray";
    }

    void PrintInfo() {
        System.out.print(name + " " + age);
        System.out.println();
    }

    void PrintAllInfo() {
        Field[] fields = getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            System.out.print(field.getName() + " " + this.getAge());
        }
    }

    public Integer getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%s %d", name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null)
            return false;
        if (obj.getClass() != this.getClass()) {
            return false;
        }

        Cat other = (Cat) obj;
        // Field[] fields = other.getClass().getDeclaredFields();
        if (!this.name.equals(other.name) || this.age != other.age) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = this.name != null ? this.name.hashCode() : 0;
        result += (this.age + prime + this.name.length());
        // System.out.print(result+ " ");
        return result;
    }
}
