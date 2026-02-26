import java.io.FileNotFoundException;
import java.util.Scanner;

class Main {
  public static void main(String[] args) throws FileNotFoundException {
    UnitTest test = new UnitTest("student-answers.csv");
    double totalCorrectInClass = 0.0;
    int totalPassingStudents = 0;
    for (StudentAnswer student : test.getStudentAnswers()) {
      System.out.println(student.getStudentName() + ": " + test.totalCorrect(student.getStudentName()) + " correct\tPassed?: " + test.isPassing(student.getStudentName()));
      totalCorrectInClass += test.totalCorrect(student.getStudentName());
      if (test.isPassing(student.getStudentName())) {
        totalPassingStudents++;
      }
    }
    
    System.out.println("\nTotal students who passed: " + totalPassingStudents + "\nAverage questions correct: " + totalCorrectInClass/test.getStudentAnswers().length);


    
  }
}
