package by.tms.onl30.trainingmanual.task1.classes;

public class Developer {
    private int id;
    private String name;

    public Developer(int idDeveloper, String nameDeveloper) {
        this.id = idDeveloper;
        this.name = nameDeveloper;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
