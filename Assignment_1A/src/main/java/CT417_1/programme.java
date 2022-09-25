package CT417_1;

import org.joda.time.DateTime;

import java.util.ArrayList;

public class programme {

    private String courseName;
    private DateTime startDate;
    private DateTime endDate;

    private ArrayList<module> modules;
    private ArrayList<student> students;

    public programme(String courseName, ArrayList<module> modules, ArrayList<student> students, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public programme(String courseName, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public programme(String courseName) {
        this.courseName = courseName;
    }

    public DateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }

    public DateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public ArrayList<module> getModules() {
        return this.modules;
    }

    public void addModules(module module) {
        modules.add(module);
    }

    public ArrayList<student> getStudents() {
        return this.students;
    }

    public void addStudents(student student) {
        students.add(student);
    }


}
