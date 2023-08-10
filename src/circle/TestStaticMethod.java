package circle;

public class TestStaticMethod {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle circle1 = new Circle(3.5);

        System.out.println(circle.getArea());
        System.out.println(circle.getRadius());
        System.out.println(circle1.getArea());
        System.out.println(circle1.getRadius());
    }
}
