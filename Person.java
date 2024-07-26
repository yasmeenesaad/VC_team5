public class Person {
    String name;
    int ID;
    String Email;

    public Person(String name, int ID, String email) {
        this.name = name;
        this.ID = ID;
        Email = email;
    }

    public Person() {
        this.name = "no name";
        this.ID =0 ;
        Email = "no email";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
