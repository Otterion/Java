package prac4_1.task7;

public class Student extends Learner{
    String university;

    public Student(String firstName, String lastName, String university) {
        super(firstName, lastName);
        this.university = university;
        super.occupation = "student";
    }
}
