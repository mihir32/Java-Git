package lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.LinkedList;


public class SubjectSet {
    private final LinkedList<Subject> subjects = null;

    public SubjectSet() {
        // TODO
    }

    public void addSubject(String code, String strk, String name) {

        // TODO

    }

    public void addSubject(Subject subject) {

        // TODO

    }

    public void removeSubject(Subject subj) {

        // TODO

    }

    public void list() {

        // TODO

    }

    public void readSubjectsFile(String filename) throws IOException {

        // TODO

    }

    public Subject findSubject(String key) {
        // TODO
        return null;
    }

    public void closeSubjects() {
        for (Subject subj : subjects) {
            subj.closeSubject();
        }
    }

}
