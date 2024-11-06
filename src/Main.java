//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Students students1 = new Students("Baiel", 19, 15);
        Students students2 = new Students("Kanchoro", 21, 40);
        Students students3 = new Students("Aibek", 15, 10);
        Cours cours = new Cours("java16", "Muhammed", new Students[]{students1,students2,students3});
        cours.getInfoCourse();
    }
}