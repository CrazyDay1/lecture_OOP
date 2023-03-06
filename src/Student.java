// created by team in KL
import java.io.*;
import java.security.spec.ECField;
import java.util.*;

public class Student {
    // data/attributes
    private Name name;
    private String kp;
    Info info = new Info();
    Address address = new Address();
    private float marks[] = new float[5];
    FileLoader file = new FileLoader("result.txt");

    float total = 0, Min = 100, Max = 0;

    // methods or operations
    public float calcAvg() {
        for(int i = 0; i < marks.length; i++){
            total += marks[i];
        };
        return total / marks.length;
    }

    public float calcMin() {
        for(int i = 0; i < marks.length; i++){
            if (marks[i] < Min){
                Min = marks[i];
            }
        };
        return Min;
    }

    public float calcMax() {
        for(int i = 0; i < marks.length; i++){
            if (marks[i] > Max){
                Max = marks[i];
            }
        };
        return Max;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public String getName(){
        return name.getFname();
    }

    public void setIC(String ic){
        info.setIC(ic);
    }

    public String getIC(){
        return info.getIC();
    }

    public void setAddress(Address address){
        this.address = address;
    }

    public String getAddress(){
        return address.getAddress();
    }

    public void setYear(int Year){
        info.setNumyearexp(Year);
    }

    public int getYear(){
        return info.getNumyearexp();
    }

    public void setSchoolname(String schoolname){
        info.setSchoolName(schoolname);
    }

    public String getSchoolname(){
        return info.getSchoolName();
    }

    public void setMark(float mark, int i){
        try{
        marks[i] = mark;
    } catch(Exception e){
            System.out.print("Something went wrong!");
        }

    }

    public void displayMarks(){
        String mark = Arrays.toString(marks);
        System.out.print("MARKS: " + mark);
    }

}