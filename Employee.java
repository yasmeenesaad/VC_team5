import java.util.Date;

public class Employee extends Person {
    long Salary;
    Date Join_date;
    String notes;

    public Employee(String name, int ID, String email, long salary, Date join_date, String notes) {
        super(name, ID, email);
        Salary = salary;
        Join_date = join_date;
        this.notes = notes;
    }

    public Employee(long salary, Date join_date, String notes) {
        Salary = salary;
        Join_date = join_date;
        this.notes = notes;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public Date getJoin_date() {
        return Join_date;
    }

    public void setJoin_date(Date join_date) {
        Join_date = join_date;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
