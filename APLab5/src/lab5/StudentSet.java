package lab5;

//import java.io.BufferedReader;
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class StudentSet {
    ArrayList<Student> students = new ArrayList<>();

    public void addStudent(String name, String rollNum) {

        students.add(new Student(name, rollNum));
    }

    public void removeStudent(Student std) {

        students.remove(std);
    }

    public void list() {

        // TODO
            System.out.println("List of Students - ");

            for (Student s : students) {
                s.println();

        }

    }

    public Student findStudent(String rollNum) {
        // TODO
        return null;
    }

    public void readStudentsFile(String filename) throws IOException {

        Scanner sc=new Scanner(new FileInputStream(filename));

        while(sc.hasNextLine())
        {
            String s=sc.nextLine();
            String[] name = s.split(" ");

            int n= name.length;
            String s1="";
            for(int i=0;i<n-1;i++)
            {
                s1=s1.concat(name[i]+" ");
            }
            addStudent(s1,name[n-1]);
        }

        sc.close();

    }

    public void gradeStudents4Subject(Subject subj, Teacher teacher) {
        for (Student std : students) {
            teacher.gradeStudent4Subject(std, subj);
        }
    }

    public boolean empty() {
        return students.isEmpty();
    }

}
