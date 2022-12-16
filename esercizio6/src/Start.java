public class Start {
    public static void main(String[] args) {

        Shape shape1 = new Shape();
        String shape1Details = shape1.getShapeDetails();

        Shape shape2 = new Shape(2.5);
        String shape2Details = shape2.getShapeDetails();

        Shape shape3 = new Shape(4, 5.0);
        String shape3Details = shape3.getShapeDetails();

        Shape shape4 = new Shape(4, 6.0, 8.0);
        String shape4Details = shape4.getShapeDetails();

        Shape shape5 = new Shape(3, 3.0, 4.0, 5.0);
        String shape5Details = shape5.getShapeDetails();

        System.out.println(shape1Details);
        System.out.println(shape2Details);
        System.out.println(shape3Details);
        System.out.println(shape4Details);
        System.out.println(shape5Details);
    }
}
