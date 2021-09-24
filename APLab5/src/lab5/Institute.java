package lab5;

//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.lang.*;

public class Institute {

    static TeacherSet teacher = new TeacherSet();
    static StudentSet students = new StudentSet();
    static SubjectSet subjects = new SubjectSet();

    public static void main(String[] args) throws IOException {

        teacher.readTeachersFile("C:\\Users\\laksh\\Downloads\\APLab5\\Data-Lab05\\teachers.txt");
        teacher.list();

        System.out.println("---");


        students.readStudentsFile("C:\\Users\\laksh\\Downloads\\APLab5\\Data-Lab05\\students.txt");
        students.list();
    }
}

//
//        System.out.println("---");
//
//        System.out.println("Begin on time enrollment processing");
//        processLateEnrollmentFile(" /* pass path to file */ ");
//
//        System.out.println("---");
//
//        System.out.println("Begin teaching assignment file processing");
//        processTeacherDuty(" /* pass path to file */ ");
//
//        System.out.println("---");
//
//        System.out.println("Begin processing subject Add/Drops");
//        processLateEnrollmentFile(" /* pass path to file */ ");
//
//        System.out.println("---");
//
//        System.out.println("Students Studying AP");
//        subjects.findSubject("AP").listStudents();
//
//        System.out.println("---");
//
//        System.out.println("Instructors for AP");
//        subjects.findSubject("AP").listInstructors();
//
//        System.out.println("---");
//
//        System.out.println("Term Ends!");
//
//        subjects.closeSubjects();
//
//    }
//
//    public static void processOnTimeEnrollmentFile(String fileName) throws IOException {
//        // TODO
//
//    }
//
//    public static void processLateEnrollmentFile(String fileName) throws IOException {
//
//        // TODO

//    }
//
//    private static void processTeacherDuty(String fileName) throws IOException {
//        Scanner fileScanner = null, scanner;
//        String line;
//
//        try {
//            String subjStr, name;
//            Teacher guru;
//            Subject subj;
//
//            fileScanner = new Scanner(new BufferedReader(new FileReader(fileName)));
//
//            while (fileScanner.hasNext()) {
//                name = fileScanner.nextLine(); /* Read Teachers Name */
//
//                line = fileScanner.nextLine(); /* Read List of Assigned Subjects */
//
//                guru = teacher.findTeacher(name);
//
//                if (guru == null) {
//                    continue;
//                }
//
//                scanner = new Scanner(line);
//
//                while (scanner.hasNext()) {
//                    subjStr = scanner.next();
//                    subj = subjects.findSubject(subjStr);
//
//                    if (subj == null) {
//                        continue;
//                    }
//
//                    subj.addTeacher(guru);
//                    guru.addSubject(subj);
//                }
//            }
//        } finally {
//            if (fileScanner != null) {
//                fileScanner.close();
//            }
//        }
//    }
//
//}
