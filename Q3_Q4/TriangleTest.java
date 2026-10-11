package Q3_Q4;


public class TriangleTest {
    public static void main(String[] args) {
        Triangle[] triangles = { new EquilateralTriangle(5), new RightTriangle(3, 4, 5) };
        for (Triangle t : triangles) {
            System.out.println(t.getClass().getSimpleName());
            System.out.println("  Longest side:  " + t.getLongestSideLength());
            System.out.println("  Perimeter:     " + t.getPerimeter());
            System.out.println("  Largest angle: " + t.getLargestAngle());
        }
    }
}