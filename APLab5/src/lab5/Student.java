package lab5;

public class Student extends Person {
    String rollNum;
    SubjectSet Studies;

    public Student(String name, String rollNum) {
        this.name = name;
        this.rollNum = rollNum;
    }

    public void addSubject(String code) {
        // TODO
    }

    boolean respondsTo(String knownAs) {
        return knownAs.equalsIgnoreCase(name);
    }

    void println() {
        System.out.println(name + " " + rollNum);
    }


    public void addSubject(Subject subj) {
        // TODO
    }

    public void removeSubject(Subject subj) {
        // TODO
    }


}
