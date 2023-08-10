package student1;
import java.sql.SQLOutput;

public class TestStaticMethod {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1();
        s1.setName("Duong");
        s1.setClasses("C06");
        s2.setName("Tung");
        s2.setClasses("C06");
        System.out.println(s1 + " " + s2);
    }
}
