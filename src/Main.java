// application team in UTP
public class Main
{
    // application code
    public static void main(String[] args) {
        Name name = new Name("Joe", "Biden", "Freedom");
        Student student = new Student();
        Teacher test1 = new Teacher();
        Teacher test2 = new Teacher();
        Teacher test3 = new Teacher();
        Teacher test4 = new Teacher();
        Teacher test5 = new Teacher();


        Teacher teacher = new Teacher();
        student.setName(name);
        TuitionCentre tuitionCentre = new TuitionCentre();
        //FileLoader fileLoader = new FileLoader("C:\\Users\\User\\Desktop\\lecture_OOP\\src\\result");

        student.setMark(99,1);
        student.setMark(50,0);
        student.setMark(40,2);
        student.setMark(30,3);
        student.setMark(20,4);
        student.displayMarks();

        tuitionCentre.setTeachers(test1);
        tuitionCentre.setTeachers(test2);
        tuitionCentre.setTeachers(test3);
        tuitionCentre.setTeachers(test4);
        //tuitionCentre.setTeachers(test5);
        System.out.print(tuitionCentre.numOfTeachers());
        test3.setQualification("Work in Cs before");
        test3.setName(name);
        tuitionCentre.getTeacherBackGround("Joe");

        System.out.print(tuitionCentre.getTeacherBackGround("Joe"));


    }
}

/*Each tuition center, situated in a physical address and headed by a HeadMaster, employs a number of tutors to handle batches of students (they take in a new batch each year). Tutors are all freelancers; they come and go throughout the year, and each student is assigned to one tutor. Each center maintains the data for each tutor (name, IC,  address, qualification, # yearexp, date joined, # years in the center etc) and each student (name, IC, address, year, schoolname, list of scores, etc).
Pandai Sdn Bhd from time to time needs report on the performance of each center - #students, #tutors, avg marks, min, max,  tutors background, etc.*/