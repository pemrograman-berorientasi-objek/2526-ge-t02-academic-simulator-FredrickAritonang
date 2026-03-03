package academic.model;

/**
 * @author 12S24001 Fredrick Laurensius Aritonang
 */
public class Course {
    private String code;
    private String name;
    private int credits;
    private String grade; // This refers to the default grade for the course, if any, as per Task 01 example.

    public Course(String code, String name, int credits, String grade) {
        this.code = code;
        this.name = name;
        this.credits = credits;
        this.grade = grade;
    }

    // Getters are good practice and might be needed for future tasks
    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getCredits() {
        return credits;
    }

    public String getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return code + "|" + name + "|" + credits + "|" + grade;
    }
}