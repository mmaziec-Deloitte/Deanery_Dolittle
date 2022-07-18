public class Student {

    private String firstName;
    private String secondName;
    private int id;

    //TODO formatting - unnecessary empty line
    public Student (String firstName, String secondName, int id) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void serve(String room, int hour){} //TODO if you wanted the children to override this method -> it should be abstract and the Student class should be abstract as well

}
