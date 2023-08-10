package student;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student.change();

        Student s1 = new Student(111,"Duong");
        Student s2 = new Student(112,"Hung");
        Student s3 = new Student(113,"Kien");
        Student s4 = new Student(114,"Long");

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
