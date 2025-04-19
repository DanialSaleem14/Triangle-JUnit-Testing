package Testing;

import static org.junit.Assert.*;


import org.junit.Test;
public class TriangleTestingTest {

    public String classifyTriangle(int s1, int s2, int s3) {
        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
            if (s1 == s2 && s2 == s3) {
                return "Equilateral Triangle";
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                return "Isosceles Triangle";
            } else {
                return "Scalene Triangle";
            }
        } else {
            return "Not a Triangle";
        }
    }

    @Test
    public void testEquilateralTriangle() {
        assertEquals("Equilateral Triangle", classifyTriangle(3, 3, 3));
    }

    @Test
    public void testIsoscelesTriangle() {
        assertEquals("Isosceles Triangle", classifyTriangle(5, 5, 3));
    }

    @Test
    public void testScaleneTriangle() {
        assertEquals("Scalene Triangle", classifyTriangle(4, 5, 6));
    }

    @Test
    public void testNotATriangle() {
        assertEquals("Not a Triangle", classifyTriangle(1, 2, 10));
    }@Test
    public void verifyInvalidTriangles() {
        assertEquals("Invalid Triangle", classifyTriangle(0, 0, 0));
        assertEquals("Invalid Triangle", classifyTriangle(3, -1, 2));
        assertEquals("Invalid Triangle", classifyTriangle(-2, 3, 1));
        assertEquals("Invalid Triangle", classifyTriangle(2, 3, -1));
        assertEquals("Invalid Triangle", classifyTriangle(2, 2, -3));
    }

    @Test
    public void catchDegenerateTriangle() {
        assertEquals("Not a Triangle", classifyTriangle(1, 2, 3));
        assertEquals("Not a Triangle", classifyTriangle(5, 1, 4));
        assertEquals("Not a Triangle", classifyTriangle(12, 15, 30));
        assertEquals("Not a Triangle", classifyTriangle(2, 4, 6));
    }

}