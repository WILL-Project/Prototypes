package com.sbo.jumblingsencance;

public class TeacherData {
    private String TeacherID;
    private String CorrectSentance;
    private String IncorrectSenctance;

    public TeacherData(String teacherID, String correctSentance, String incorrectSenctance) {
        setTeacherID(teacherID);
        setCorrectSentance(correctSentance);
        setIncorrectSenctance(incorrectSenctance);
    }
    public TeacherData(){

    }

    public String getTeacherID() {
        return TeacherID;
    }

    public void setTeacherID(String teacherID) {
        TeacherID = teacherID;
    }

    public String getCorrectSentance() {
        return CorrectSentance;
    }

    public void setCorrectSentance(String correctSentance) {
        CorrectSentance = correctSentance;
    }

    public String getIncorrectSenctance() {
        return IncorrectSenctance;
    }

    public void setIncorrectSenctance(String incorrectSenctance) {
        IncorrectSenctance = incorrectSenctance;
    }
}
