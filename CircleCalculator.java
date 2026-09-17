public class CircleCalculator {
    public static void main(String[] args) {

        double radius = 7.5;

        double area = Math.PI * radius * radius;
        double squareRoot = Math.sqrt(radius);

        double randomNumber = Math.random();

        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area);
        System.out.println("Square root: " + squareRoot);
        System.out.println("Random number: " + randomNumber);
    }
}
