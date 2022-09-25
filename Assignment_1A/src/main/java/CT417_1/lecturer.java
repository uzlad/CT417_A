package CT417_1;

import java.util.ArrayList;

public class lecturer {
    private String name;
    private int age;
    private String DOB;
    private long ID;
    private String userName;

    private ArrayList<module> modules;

    public lecturer(String name, int age, String DOB, long ID){
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.ID = ID;
        this.userName = getUserName();
        this.modules = new ArrayList<module>();
    }

    public String getUserName() {
        userName =  name + String.valueOf(age);
        return userName;
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

    public void addModules(module module){
        modules.add(module);
    }
    public ArrayList<module> getModule(){
        return modules;
    }

}
