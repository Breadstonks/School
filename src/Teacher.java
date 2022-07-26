public class Teacher {
    //This string is for the First name, and it is private, so it cannot be accessed outside the class, only by using getters and setters
    private String FirstName;
    //This string is for the last name
    private String LastName;
    //This string is for the subject
    private String Subject;
    //This constructor will set the variables to its default. The strings are all empty
    Teacher(){
        FirstName = "";
        LastName = "";
        Subject = "";
    }
    //Below are the setters and getters, which allow the strings to be accessed from different classes
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

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }
}
