package lab5;

public class Teacher extends Person {
    String dept;

    SubjectSet teaches;

    public Teacher(String name, String dept) {
        this.name = name;
        this.dept = dept;
        teaches = new SubjectSet();
    }

    boolean respondsTo(String knownAs) {

        return knownAs.equalsIgnoreCase(name);
    }

    public void println() {
        System.out.println(name + "@" + dept);
    }


    public void addSubject(Subject subj) {
        if (teaches.findSubject(subj.code) == null) {
            teaches.addSubject(subj);
        }
    }

    public void gradeSubject(Subject subj) {

        subj.gradeStudents(this);
    }

    public void gradeStudent4Subject(Student std, Subject subj) {

        subj.setGrade(std, this, "A");
    }
}
