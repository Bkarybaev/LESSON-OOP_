public class Students {
    String name;
    int age;
    int word;

    public Students(String name, int age, int word) {
        if (age < 16) {
            this.name = name;
        } else {
            this.name = name;
            this.age = age;
            this.word = word;
        }

    }
}
