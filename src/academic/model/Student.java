package academic.model;

/**
 * @author 12S24001 Fredrick Laurensius Aritonang
 */
public class Student {
    private String id;
    private String name;
    private int entryYear;
    private String major;

    public Student(String id, String name, int entryYear, String major) {
        this.id = id;
        this.name = name;
        this.entryYear = entryYear;
        this.major = major;
    }

    // Getters are good practice and might be needed for future tasks
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getEntryYear() {
        return entryYear;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return id + "|" + name + "|" + entryYear + "|" + major;
    }
}