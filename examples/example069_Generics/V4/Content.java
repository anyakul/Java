package examples.example069_Generics.V4;

public abstract class Content {
    public String name;

    public Content(String name) {
        this.name = name;
    }

    public Content() {
        this("-");
    }

    @Override
    public String toString() {
        return name;
    }
}
