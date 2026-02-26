public class StudentAnswer {
    //Instance variables
    private String studentName;
    private String[] answers;

    public StudentAnswer(String n, String[] ans) {
        studentName = n;
        answers = ans;
        answers = new String[ans.length];
        for (int i = 0; i < ans.length; i++) {
            answers[i] = ans[i];
        }
    }

    public String getStudentName() {
        return studentName;
    }

    public String[] getAnswers() {
        return answers;
    }

    public String toString() {
    String answersString = "\n\n\nSTUDENT ANSWERS";
    int questionNum = 1;
    for (int i = 0; i < answers.length; i++) {
      answersString += "\n"+  questionNum + ") " + answers[i];
      questionNum++;
    }
    return answersString;
    }
}