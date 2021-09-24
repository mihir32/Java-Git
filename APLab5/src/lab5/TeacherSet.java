package lab5;

import java.io.*;
//import java.io.FileReader;
//import java.io.BufferedReader;
//import java.io.IOException;
import java.util.*;
import java.lang.*;
//import java.util.LinkedList;
//import java.util.Scanner;

public class TeacherSet {
    private final LinkedList<Teacher> myList = new LinkedList<Teacher>();

    public void addTeacher(String name, String dept) {

        myList.add(new Teacher(name, dept));
    }

    public void list() {
        System.out.println("List of employed teachers");

        for (Teacher t : myList) {
            t.println();
        }
    }

    public Teacher findTeacher(String name) {
        for (Teacher t : myList) {
            if (t.respondsTo(name)) {
                return t;
            }
        }

        return null;
    }

    public void readTeachersFile(String filename) throws IOException {

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
            addTeacher(s1,name[n-1]);
            }

            sc.close();

    }

    public void addTeacher(Teacher guru) {
        myList.add(guru);

    }

    public Teacher getIncharge() {
        return myList.getFirst();
    }

    public boolean empty() {
        return myList.isEmpty();
    }
}
