package io.zipcoder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Classroom {

    Student[] students;

    public Classroom(int maxNumberOfStudents){
        this.students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students){
        this.students = students;
//        Student[] theArray = new Student[students.length];
//        for(int i = 0; i < students.length; i++){
//            theArray[i] = students[i];
//        }
    }

    public Classroom(){
        this.students = new Student[30];
    }

    public Student[] getStudents() {
        return students;
    }

    public Double getAverageExamScores(){
        Double sum = 0.0;

        for(int i = 0; i < this.students.length; i++){
           sum += students[i].getAverageExamScore();
        }

        return sum / this.students.length;
    }

    public void addStudent(Student student){
        Student[] theArray = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++) {
            theArray[i] = students[i];
        }
        theArray[students.length -1] = student;
        this.students = theArray;
    }

    public void removeStudent(String firstName, String lastName){
        List<Student> studentsArray = new ArrayList<>(Arrays.asList(students));
        for (int i = 0; i < students.length; i++) {
            Student student = studentsArray.get(i);
            String fName = student.getFirstName();
            String lName = student.getLastName();

            if(fName.equals(firstName) && lName.equals(lastName)){
                studentsArray.remove(student);
            }
        }
        studentsArray.add(null);


        this.students = studentsArray.toArray(new Student[0]);
    }

    public Student[] getStudentsByScore(){
        List<Student> studentsArray = new ArrayList<>(Arrays.asList(students));
        List<Double> studentAverageScores = new ArrayList<>();
        List<Student> sortedStudents = new ArrayList<>();

        for(int i = 0; i < students.length; i++){
            studentAverageScores.add(students[i].getAverageExamScore());
        }
        Collections.sort(studentAverageScores);
        Collections.reverse(studentAverageScores);

//        for (int i = 0; i <studentAverageScores.size(); i++){;
//            Double studentsScores = checkedStudent.getAverageExamScore();
//            if (checkedStudent.getAverageExamScore() )
        return students;

        }


    }

