public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape() {
        shapeName = "Undefined shape";
        System.out.println("A new Shape object has been created.");
    }

    public Shape(double radius) {
        shapeName = "Circle";
        numberOfEdges = 0;
        System.out.println("A new Circle object has been created with radius " + radius + ".");
    }

    public Shape(int edges, double edgeLength) {
        shapeName = "Square";
        numberOfEdges = edges;
        System.out.println("A new Square object has been created with " + edges + " edges of length " + edgeLength + ".");
    }

    public Shape(int edges, double e1, double e2) {
        shapeName = "Rectangle";
        numberOfEdges = edges;
        System.out.println("A new Rectangle object has been created with " + edges + " edges of lengths " + e1 + " and " + e2 + ".");
    }

    public Shape(int edges, double e1, double e2, double e3) {
        shapeName = "Triangle";
        numberOfEdges = edges;
        System.out.println("A new Triangle object has been created with " + edges + " edges of lengths " + e1 + ", " + e2 + ", and " + e3 + ".");
    }

    public String getShapeDetails() {
        return "Shape name: " + shapeName + " Number of edges: " + numberOfEdges;
    }
}
