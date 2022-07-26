//This class is for the students, and it will create Strings and Int variables for the students
public class Student {
    //This string is for the First name, and it is private, so it cannot be accessed outside the class, only by using getters and setters
    private String FirstName;
    //This string is for the last name
    private String LastName;
    //This int is for the grade
    private int Grade;
    //This int is for the student ID number
    private int id;
    //This constructor will set the variables to its default, with the strings being empty and the ints being 0
    Student(){
        FirstName = "";
        LastName = "";
        Grade = 0;
        id = 0;
    }
    //Below are the setters and getters, which allow the strings and ints to be accessed from different classes
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getGrade() {
        return Grade;
    }

    public void setGrade(int grade) {
        Grade = grade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
