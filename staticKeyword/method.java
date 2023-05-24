package staticKeyword;

public class method {
    private static final double PI = 3.14159;
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static double calculateCircleArea(double radius) {
        return PI * radius * radius;
    }
    public static void main(String[] args) {
           add(4, 7);
    }
}
