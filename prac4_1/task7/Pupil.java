package prac4_1.task7;

public class Pupil extends Learner{
    String school;

    public Pupil(String firstName, String lastName, String school) {
        super(firstName, lastName);
        this.school = school;
        super.occupation = "pupil";
    }
}
