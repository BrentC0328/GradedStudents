package io.zipcoder;

import java.util.Arrays;
import java.util.List;

public class Student {
    String firstName;
    String lastName;
    List<Double> examScore;

    public Student(String firstName, String lastName, Double[] testScores){
        this.firstName = firstName;
        this.lastName = lastName;
        this.examScore = Arrays.asList(testScores);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getNumberOfExamsTaken(){
        return this.examScore.size();
    }

    public String getExamScore() {
        StringBuilder examScores = new StringBuilder();
        for (int i = 0; i < this.examScore.size(); i++){
            examScores.append("Exam ")
                    .append(i + 1)
                    .append(" ->")
                    .append(this.examScore.get(i))
                    .append("\n");
        }



        return examScores.toString();
    }

    public void addExamScore(double examScore){
        this.examScore.add(examScore);
    }

    public void setExamScore(int examNumber, double newScore){
        this.examScore.set(examNumber, newScore);
    }

    public Double getAverageExamScore(){
        Double sum = 0.0;
        for (int i = 0; i < this.examScore.size(); i++){

        }

    }


}
