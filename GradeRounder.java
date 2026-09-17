public class GradeRounder {
    public static void main(String[] args) {

        double rawGrade = 87.65;
        int castedGrade = (int) rawGrade;

        System.out.println("Original Grade: " + rawGrade);
        System.out.println("Casted Grade: " + castedGrade);

        // Casting from double to int removes the decimal part.
        // It does not round the number.
    }
}
