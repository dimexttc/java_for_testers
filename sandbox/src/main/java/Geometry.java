public class Geometry {
    public static void main(String[] args) {
        printSquareArea(2);
        printRectangleArea(3.0,5.0);
    }

    private static void printRectangleArea(double a, double b) {
        System.out.println("площадь прямоугольника со сторонами "+a+" и "+b+" = "+ rectangleArea(a,b));
    }

    private static double rectangleArea(double a, double b) {
        return a*b;
    }

    static void printSquareArea(double side){
        System.out.println("площадь квадрата со стороной "+side+" = "+ squareArea(side));
    }

    private static double squareArea(double a) {
        return a * a;
    }
}
