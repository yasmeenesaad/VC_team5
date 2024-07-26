public class Student  extends Person{
    float grades;
    String Stage;

    public Student(String name, int ID, String email, float grades, String stage) {
        super(name, ID, email);
        this.grades = grades;
        Stage = stage;
    }

    public Student(float grades, String stage) {
        this.grades = grades;
        Stage = stage;
    }

    public float getGrades() {
        return grades;
    }

    public void setGrades(float grades) {
        this.grades = grades;
    }

    public String getStage() {
        return Stage;
    }

    public void setStage(String stage) {
        Stage = stage;
    }
}
