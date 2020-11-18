import java.util.ArrayList;
import java.util.List;

public class Student implements Nameable, HasLevel {
    private List<Double> grades;
    private String name;
    private Level level;

    public Student(){
        this.grades= new ArrayList<Double>();
        this.name="";
        this.level= Level.FIRST;
    }

    public void addGrade(double grade){
        grades.add(grade);
    }

    public Double getAverageGrade(){
        Double sum=0.0;
        for(Double num: grades){
            sum+=num;
        }
        return sum/grades.size();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Level getLevel() {
        return level;
    }
}
