package Q3_Q4;

public class TriangleManagerTest {
    public static void main(String[] args) {
        for (boolean useArrayList : new boolean[] { true, false }) {
            System.out.println(useArrayList ? "--- ArrayList ---" : "--- LinkedList ---");
            TriangleManager m = new TriangleManager(useArrayList);
            m.addTriangle(new EquilateralTriangle(5));   // perimeter 15
            m.addTriangle(new RightTriangle(3, 4, 5));   // perimeter 12
            m.addTriangle(new EquilateralTriangle(10));  // perimeter 30

            Triangle best = m.findTriangleWithLargestPerimeter();
            System.out.println("Largest: " + best.getClass().getSimpleName()
                    + ", perimeter = " + best.getPerimeter());

            try {
                m.addTriangle(null);
            } catch (IllegalArgumentException e) {
                System.out.println("Caught: " + e.getMessage());
            }
        }
    }
}
