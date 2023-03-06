import java.util.ArrayList;

public class TuitionCentre {
    private ArrayList<Teacher> teachers= new ArrayList<Teacher>();
    private ArrayList<Student> students= new ArrayList<Student>();

    public void setTeachers(Teacher tutor){
        teachers.add(tutor);
    }

    public ArrayList<Teacher> getTeachers(){
        return teachers;
    }

    public void setStudents(Student student){
        students.add(student);
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public int numOfTeachers(){
        return teachers.size();
    }

    public int numOfStudent(){
        return students.size();
    }

    public String getTeacherBackGround(String name){
        for(int i = 0; i < teachers.size(); i++){
            Teacher curr = teachers.get(i);
            if(curr.getName() == name){
                return curr.getQualification();
            }
        }
        return "None";
    }
}
