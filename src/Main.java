//Imports the arraylist for the arraylist to be used
import java.util.ArrayList;
//Imports the scanner so the user can input whether they would like to see the list
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Creates a new scanner
        Scanner in = new Scanner(System.in);
        //Strings the variable, so it can be used to determine which list they would like to show
        String UserResponse;
        //Prints out the sentence and gives the user 3 options to pick from
        System.out.println("Which list would you like to show? (Teachers/Students/Both): ");
        UserResponse = in.next();
        //Regardless of the outcome, two arraylists will be created. One for the teachers
        ArrayList<Teacher> teachers = new ArrayList<>();
        //And another for the students
        ArrayList<Student> students = new ArrayList<>();
        //I used a switch statement because it looks more organized and more easy to use
        switch (UserResponse) {
            //If the user types "Teacher", then the following will occur:
            case "Teachers" -> {
                //Line break to make it pretty
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Teachers: ");
                //The for loop will add 3 elements to the arraylist
                for (int i = 0; i < 3; i++) {
                    teachers.add(new Teacher());
                }
                //The for loop will assign each element a first and last name, and a subject
                for (int i = 0; i < teachers.size(); i++){
                    //This will set the First Names from the Teacher class
                    teachers.get(i).setFirstName("Susan Steven Jones");
                    //This will set the Last Names from the Teacher class
                    teachers.get(i).setLastName("Chan Smith Kerry");
                    //This will set the subjects from the Teacher class
                    teachers.get(i).setSubject("Math Science English");
                    /*
                    Creates 3 strings. From the setters above, they set the strings in the teacher class to those
                    names, and these strings will get those strings from the class and transfers them here
                     */
                    String OtherClassFirst = teachers.get(i).getFirstName();
                    String OtherClassLast = teachers.get(i).getLastName();
                    String OtherClassSubject = teachers.get(i).getSubject();
                    //Theses 3 strings will split the string into the names and subjects from the spaces
                    String[] splitFirst = OtherClassFirst.split(" ");
                    String[] splitLast = OtherClassLast.split(" ");
                    String[] splitSubject = OtherClassSubject.split(" ");
                    /*
                    These 3 strings will create separate strings for each of the split strings, I used [i] because it
                    creates the amount strings according to the loop amount
                     */
                    String ResultFirst = splitFirst[i];
                    String ResultLast = splitLast[i];
                    String ResultSubject = splitSubject[i];
                    //Prints out the Names and subjects, I used i + 1 so the list will start at 1 and not 0
                    System.out.println((i + 1) + ". " + ResultFirst + " " + ResultLast + ", Subject: " + ResultSubject);
                }
            }
            //If the user types "Students", the following will occur:
            case "Students" -> {
                //Line breaks
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Students:");
                //The for loop will create 10 new elements (students)
                for (int i = 0; i < 10; i++) {
                    students.add(new Student());
                }
                //The for loop will assign the names and grades for the students
                for (int i = 0; i < students.size(); i++) {
                    //The two ints are the minimum grade and the maximum grade
                    int minimum = 8, maximum = 12;
                    //This will set the First Names from the students class
                    students.get(i).setFirstName("David Jimmy Melissa May Doug Jason Katie Stewart Freddy Tommy");
                    //This will set the Last Names from the students class
                    students.get(i).setLastName("Garcia Moore Rivera Harris Robinson Sanchez Lewis Thompson Sanders Chen");
                    /*
                    This will set the grade from the students class, it will be any random number (From 0 to 1) multiplied by
                    the maximum minus the minimum plus 1 ((12 - 8) + 1) so there there could be grade 12s in the list, then
                    it will be added to the minimum (8) so the grade will not be under the minimum grade
                     */
                    students.get(i).setGrade(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
                     /*
                    Creates 2 strings. From the setters above, they set the strings in the teacher class to those
                    names, and these strings will get those strings from the class and transfers them here
                     */
                    String OtherClassFirst = students.get(i).getFirstName();
                    String OtherClassLast = students.get(i).getLastName();
                    //Theses 2 strings will split the string into the names from the spaces
                    String[] splitFirst = OtherClassFirst.split(" ");
                    String[] splitLast = OtherClassLast.split(" ");
                    /*
                    These 2 strings will create separate strings for each of the split strings, I used [i] because it
                    creates the amount strings according to the loop amount
                     */
                    String ResultFirst = splitFirst[i];
                    String ResultLast = splitLast[i];
                    //This int variable will get the values from the setGrade from the student class
                    int ResultGrade = students.get(i).getGrade();
                    //Prints out the Names and grades, I used i + 1 so the list will start at 1 and not 0
                    System.out.println((i + 1) + ". " + ResultFirst + " " + ResultLast + ", Grade: " + ResultGrade);
                }
                //Line break
                System.out.println("*********************************************************************");
                System.out.println("ID Numbers: ");
                //This for loop will randomly create an ID number upon running the code
                for (int i = 0; i < students.size(); i++) {
                    //The two ints are the minimum value and the maximum value the ID numbers can be
                    int minimum = 1000000, maximum = 9999999;
                    /*
                    This will get the First Name, I will not need to set the name again because the setter has already
                    assigned the names
                     */
                    String OtherClass = students.get(i).getFirstName();
                    //Split the names with spaces
                    String[] split = OtherClass.split(" ");
                    //Then will create separate strings for each of the split strings
                    String result = split[i];
                    //Same equation as the assigning grade method, without the plus 1
                    students.get(i).setId(minimum + (int)(Math.random() * ((maximum - minimum))));
                    //Prints out the First name and ID number, I used i + 1 so the list will start at 1 and not 0
                    System.out.println((i + 1) + ". " + result + "'s ID number: " + students.get(i).getId());
                }
            }
            //If the user types both, then it will display both lists. Explaining it again would be redundant
            case "Both" -> {
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Teachers: ");
                for (int i = 0; i < 3; i++) {
                    teachers.add(new Teacher());
                }
                for (int i = 0; i < teachers.size(); i++){
                    teachers.get(i).setFirstName("Susan Steven Jones");
                    teachers.get(i).setLastName("Chan Smith Kerry");
                    teachers.get(i).setSubject("Math Science English");
                    String OtherClassFirst = teachers.get(i).getFirstName();
                    String OtherClassLast = teachers.get(i).getLastName();
                    String OtherClassSubject = teachers.get(i).getSubject();
                    String[] splitFirst = OtherClassFirst.split(" ");
                    String[] splitLast = OtherClassLast.split(" ");
                    String[] splitSubject = OtherClassSubject.split(" ");
                    String ResultFirst = splitFirst[i];
                    String ResultLast = splitLast[i];
                    String ResultSubject = splitSubject[i];
                    System.out.println((i + 1) + ". " + ResultFirst + " " + ResultLast + ", Subject: " + ResultSubject);
                }
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Students:");
                for (int i = 0; i < 10; i++) {
                    students.add(new Student());
                }
                for (int i = 0; i < students.size(); i++) {
                    int minimum = 8, maximum = 12;
                    students.get(i).setFirstName("David Jimmy Melissa May Doug Jason Katie Stewart Freddy Tommy");
                    students.get(i).setLastName("Garcia Moore Rivera Harris Robinson Sanchez Lewis Thompson Sanders Chen");
                    students.get(i).setGrade(minimum + (int)(Math.random() * ((maximum - minimum) + 1)));
                    String OtherClassFirst = students.get(i).getFirstName();
                    String OtherClassLast = students.get(i).getLastName();
                    String[] splitFirst = OtherClassFirst.split(" ");
                    String[] splitLast = OtherClassLast.split(" ");
                    String ResultFirst = splitFirst[i];
                    String ResultLast = splitLast[i];
                    int ResultGrade = students.get(i).getGrade();
                    System.out.println((i + 1) + ". " + ResultFirst + " " + ResultLast + ", Grade: " + ResultGrade);
                }
                System.out.println("*********************************************************************");
                System.out.println("ID Numbers: ");
                for (int i = 0; i < students.size(); i++) {
                    int minimum = 1000000, maximum = 9999999;
                    String OtherClass = students.get(i).getFirstName();
                    String[] split = OtherClass.split(" ");
                    String result = split[i];
                    students.get(i).setId(minimum + (int)(Math.random() * ((maximum - minimum))));
                    System.out.println((i + 1) + ". " + result + "'s ID number: " + students.get(i).getId());
                }
            }
            //If the user types a typo, then it will not be recognized and will stop the code
            default -> {
                System.out.println("Invalid Command, goodbye.");
                System.exit(0);
            }
        }
        //Line break
        System.out.println("---------------------------------------------------------------------");
        //Creates a scenario for which people on the list can be removed
        System.out.println("Students Tommy and Freddy are moving schools, and teacher Jones is retiring. Would you like to see the updated list with them removed? (yes/no) ");
        //Creates another variable, which is used to determine whether the user wants to see the updated list
        String SecondResponse;
        SecondResponse = in.next();
        //Switch statement
        switch (SecondResponse){
            //If the user types yes, then the following will occur
            case "yes" -> {
                //Line break
                System.out.println("---------------------------------------------------------------------");
                //Same code as the arraylist above, except the for loop's limit is changed to 8 so that the last two names will not be printed
                System.out.println("Students:");
                for (int i = 0; i < 8; i++) {
                    students.get(i).setFirstName("David Jimmy Melissa May Doug Jason Katie Stewart Freddy Tommy");
                    students.get(i).setLastName("Garcia Moore Rivera Harris Robinson Sanchez Lewis Thompson Sanders Chen");
                    String OtherClassFirst = students.get(i).getFirstName();
                    String OtherClassLast = students.get(i).getLastName();
                    String[] splitFirst = OtherClassFirst.split(" ");
                    String[] splitLast = OtherClassLast.split(" ");
                    String ResultFirst = splitFirst[i];
                    String ResultLast = splitLast[i];
                    System.out.println((i + 1) + ". " + ResultFirst + " " + ResultLast);
                }
                //Line break
                System.out.println("---------------------------------------------------------------------");
                System.out.println("Teachers");
                //Same as the students, except of removing two I removed one
                for (int i = 0; i < 2; i++){
                    teachers.get(i).setFirstName("Susan Steven Jones");
                    teachers.get(i).setLastName("Chan Smith Kerry");
                    String OtherClassFirst = teachers.get(i).getFirstName();
                    String OtherClassLast = teachers.get(i).getLastName();
                    String[] splitFirst = OtherClassFirst.split(" ");
                    String[] splitLast = OtherClassLast.split(" ");
                    String ResultFirst = splitFirst[i];
                    String ResultLast = splitLast[i];
                    System.out.println((i + 1) + ". " + ResultFirst + " " + ResultLast);
                }
            }
            //If the user types no, then the code ends
            case "no" -> {
                System.out.println("Ok, Goodbye.");
                System.exit(0);
            }
            //If the user types a typo, the code ends
            default -> {
                System.out.println("Unknown Command.");
                System.exit(0);
            }
        }

    }
}
