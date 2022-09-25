package CT417_1;

import java.util.ArrayList;

public class module {
    private String moduleName;
    private String moduleID;
    private ArrayList<student> students;
    private ArrayList<programme> courses;
    private lecturer lecturer;


    public module(String moduleName, String moduleID, ArrayList<student> students, ArrayList<programme> courses, lecturer lecturer){
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.students = students;
        this.courses = courses;
        this.lecturer = lecturer;

    }

    public module(String moduleName, String moduleID) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
    }

    public module(String moduleName, String moduleID, lecturer lecturer) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.lecturer = lecturer;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    public String getModuleID() {
        return moduleID;
    }

    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }
    public ArrayList<student> getStudents() {
        return students;
    }

    public void addStudents(student student) {
        students.add(student);
    }

    public ArrayList<programme> getCourses() {
        return courses;
    }

    public void addCourses(programme programme) {
        courses.add(programme);
    }

    public lecturer getLecturer() {
        return lecturer;
    }

    public void setLecturer(lecturer lecturer) {
        this.lecturer = lecturer;
    }

}
