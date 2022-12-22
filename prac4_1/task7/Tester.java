package prac4_1.task7;

public class Tester {
    public static void main(String[] args) {
        Learner[] array = new Learner[6];
        array[0]=new Pupil("Данил", "Данилович","Лицей №9");
        array[1]=new Student("Иван", "Иванов","РТУ МИРЭА");
        array[2]=new Student("Илья", "Ильин","ВШЭ");
        array[3]=new Pupil("Павел", "Павлов","Школа №30");
        array[4]=new Pupil("Данил", "Данилович","Гимназия №1");
        array[5]=new Student("Александр", "Александров","МГУ");

        System.out.println("Студенты:");
        for (Learner obj : array) {
            if (obj.occupation.equals("student")){
                System.out.println(obj.firstName+" "+obj.lastName);
            }
        }
        System.out.println("\nШкольники:");
        for (Learner obj : array) {
            if (obj.occupation.equals("pupil")){
                System.out.println(obj.firstName+" "+obj.lastName);
            }
        }
    }
}
