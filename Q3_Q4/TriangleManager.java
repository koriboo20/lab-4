package Q3_Q4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TriangleManager {
    private List<Triangle> triangles;

    public TriangleManager(boolean useArrayList) {
        triangles = useArrayList ? new ArrayList<>() : new LinkedList<>();
    }

    public void addTriangle(Triangle t) {
        if (t == null) {
            throw new IllegalArgumentException("Triangle cannot be null");
        }
        triangles.add(t);
    }

    public Triangle findTriangleWithLargestPerimeter() {
        Triangle largest = null;
        for (Triangle t : triangles) {
            if (largest == null || t.getPerimeter() > largest.getPerimeter()) {
                largest = t;
            }
        }
        return largest;
    }
}
