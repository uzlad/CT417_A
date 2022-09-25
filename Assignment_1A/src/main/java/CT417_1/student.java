package CT417_1;

import java.util.ArrayList;

public class student {
    private String name;
    private int age;
    private String DOB;
    private long ID;
    private String userName;

    private ArrayList<programme> courses;
    private ArrayList<module> modules;


    public student(String name, int age, String DOB, int ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;

        this.courses = new ArrayList<programme>();
        this.modules = new ArrayList<module>();
    }


    public String getUserName() {
        return name + String.valueOf(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    public ArrayList<module> getModules(){
        return modules;
    }

    public void addModules(module module){
        modules.add(module);
    }


    public void addCourseProgramme(programme programme){
        courses.add(programme);
    }
    public ArrayList<programme> getCourses(){
        return courses;
    }

}
