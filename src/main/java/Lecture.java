import java.util.ArrayList;
import java.util.List;

public class Lecture {
    List<Student> students;

    public Lecture() {
        this.students = new ArrayList<Student>();
    }
    public void enter(Student s){
        students.add(s);
    }
    public Double getHighestAverageGrade(){
        Double highest=0.0;
        for(Student s: students){
            if(s.getAverageGrade()> highest){
                highest=s.getAverageGrade();
            }
        }
        return highest;
    }
}
