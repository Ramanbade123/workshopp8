public class GradeCalculator {

    public String calculateGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 80) {
            return "B";
        } else if (marks >= 70) {
            return "C";
        } else if (marks >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

        public static void main(String[] args) {
        GradeCalculator gradeCalculator = new GradeCalculator();

        int marks = 85; 
        String grade = gradeCalculator.calculateGrade(marks);

        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + grade);
    }
}