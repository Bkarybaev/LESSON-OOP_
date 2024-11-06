public class Course {
    String name;
    String nameTeacher;
    Students[] students;

    public Course(String name,String nameTeacher, Students[] students) {
        if (name.length() <= 2) {
            System.err.println("write name 2-word more !!!");
        } else {
            this.name = name;
            this.nameTeacher = nameTeacher;
            this.students = students;
        }
    }

    public void getInfoCourse(){
        if (this.name.length() > 2){
            System.out.printf("""
                Name Course   : %s
                Name Teacher  : %s
                
                --==STUDENTS==--
                
                """,name,nameTeacher);
        }else return;

        for (Students students1 : students){
            String failed;
            if (students1.age == 0 && students1.word == 0){
                failed = "---FAILED---";
                System.err.printf("""
        ------------------------
        Students  : %s
        Name student : %s
        Age student  : %d
        Word one minute : %d wp
        ------------------------
        """,failed,students1.name,students1.age,students1.word);
            }else {
                 failed = "***YOUR WIN***";
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
