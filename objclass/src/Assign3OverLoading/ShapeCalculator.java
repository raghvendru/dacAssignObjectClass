package Assign3OverLoading;
class ShapeCalculator {

    public double area(int side) {
        return side * side;
    }

    public double area(int length, int breadth) {
        return length * breadth;
    }
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    public double area(double base, double height, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * height;
        } else {
            return -1; 
        }
    }

    public static void main(String[] args) {
        ShapeCalculator sc = new ShapeCalculator();
        System.out.println("Area of Square:" + sc.area(5));
        System.out.println("Area of Rectangle:" + sc.area(4, 6));
        System.out.println("Area of Circle:" + sc.area(3.5));
        System.out.println("Area of Triangle:" + sc.area(10, 6, true));
    }
}
