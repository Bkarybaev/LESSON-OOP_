import java.util.Arrays;

public class Cours {
    String name;
    String nameTeacher;
    Students[] students;

    public Cours(String name,String nameTeacher, Students[] students) {
        if (name.length() <= 2) {
            System.out.println("write name 2-word more !!!");
        } else {
            this.name = name;
            this.nameTeacher = nameTeacher;
            this.students = students;
        }
    }

    public void getInfoCourse(){
        System.out.printf("""
                Name Course   : %s
                Name Teacher  : %s
                """,name,nameTeacher);
        for (Students students1 : students){
            String failed;
            if (students1.age == 0){
                System.err.printf("""
        ------------------------
        Students  : failed
        Name student : %s
        Age student  : %d
        Word one minute : %d wp
        ------------------------
        """,students1.name,students1.age,students1.word);
            }else {
                 failed = "your win ";
                System.out.printf("""
        ------------------------
        Students  : %s
        Name student : %s
        Age student  : %d
        Word one minute : %d wp
        ------------------------
        """,failed,students1.name,students1.age,students1.word);
            }

        }
    }
}
