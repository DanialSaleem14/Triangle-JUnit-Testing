package Testing;
import java.util.Scanner;
public class TriangleTesting {
    public static void main(String[] args) {
        Scanner getinput = new Scanner(System.in);

        System.out.println("Enter the Sides of the Triangle: ");
        int s1 = getinput.nextInt();
        int s2 = getinput.nextInt();
        int s3 = getinput.nextInt();

        String result = classifyTriangle(s1, s2, s3);
        System.out.println(result);

        getinput.close();
    }

    public static String classifyTriangle(int s1, int s2, int s3) {
        if (s1 < (s2 + s3) && s2 < (s1 + s3) && s3 < (s1 + s2)) {
            if (s1 == s2 && s2 == s3) {
                return "It's an Equilateral Triangle";
            } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                return "It's an Isosceles Triangle";
            } else {
                return "It's a Scalene Triangle";
            }
        } else {
            return "It's not a Triangle";
        }
    }
}