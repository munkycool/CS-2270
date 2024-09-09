public class SimpRectTest {
    public static void main(String args[]) {
        SimpleRectangle r1 = new SimpleRectangle();
        SimpleRectangle r3 = new SimpleRectangle(10, 20);

        r1.setHeight(10);
        r1.setWidth(20);

        System.out.println(r1.getHeight());
        System.out.println(r1.getWidth());

        r1.grow(2,5);

        System.out.println("\n" + r1.getHeight()); //expected height is 15
        System.out.println(r1.getWidth()); // expected width is 22
    }
}
