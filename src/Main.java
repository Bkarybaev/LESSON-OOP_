//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students students1 = new Students("Baiel", 17, 15);
        Students students2 = new Students("Kanchoro", 17, 40);
        Students students3 = new Students("Aibek", 16, 10);
        Students students4 = new Students("Amir", 13, 11);
        Course course = new Course("java16", "Muhammed", new Students[]{students1,students2,students3,students4});
        course.getInfoCourse();
    }
}