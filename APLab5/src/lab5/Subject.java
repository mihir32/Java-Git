package lab5;

public class Subject {
    String name;
    String code;
    String teachingPattern;
    StudentSet subjectEnrollment;
    TeacherSet instructors;

    public Subject(String subjCode, String strk, String name) {

        // TODO

    }

    public boolean isNamed(String key) {
        // TODO
        return false;
    }

    public void println() {
        // TODO

    }

    public void addStudent(Student std) {

        // TODO

    }

    public void removeStudent(Student std) {

        // TODO

    }

    public void listStudents() {

        // TODO

    }

    public void addTeacher(Teacher guru) {

        // TODO

    }

    public void closeSubject() {
        if (wasTaught()) {
            instructors.getIncharge().gradeSubject(this);
        } else {
            System.out.println("Untaught Subject" + code + ": " + name);
        }
    }

    private boolean wasTaught() {
        return !instructors.empty() && !subjectEnrollment.empty();
    }

    public void setGrade(Student std, Teacher grader, String grade) {
        System.out.println(std.name + " (" + std.rollNum + ") obtained grade " + grade
                + "in subject " + code + ": " + name + " by " +
                grader.name + "@" + grader.dept);
    }

    public void gradeStudents(Teacher teacher) {
        subjectEnrollment.gradeStudents4Subject(this, teacher);
    }

    public void listInstructors() {

        // TODO

    }

}
