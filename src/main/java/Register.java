import java.util.Collections;
import java.util.List;

public class Register {
    List<Nameable> nameables;

    public Register(List<Nameable> names){
        this.nameables =names;
    }

    public List<String> getRegister(){
        List<String> nameString= Collections.<String>emptyList();
        for(Nameable n: nameables){
            nameString.add(n.getName());
        }
        return nameString;
    }

    public List<String> getRegisterByLevel(Level level){
        List<String> nameString= Collections.<String>emptyList();
        for(Nameable n: nameables){
            Student tempStudent= (Student) n;
            if(tempStudent.getLevel().equals(level)) {
                nameString.add(tempStudent.getName());
            }
        }
        return nameString;
    }
    public String printReport(Level level){
        String first,second,third,fourth;
        first=second=third=fourth="";
        for(Nameable n:nameables){
            Student tempStudent= (Student) n;
            switch(tempStudent.getLevel()){
                case FIRST -> first+=tempStudent.getName();
                case SECOND -> second+=tempStudent.getName();
                case THIRD -> third+=tempStudent.getName();
                case FOURTH -> fourth+=tempStudent.getName();
            }
        }
        return first+"\n"+second+"\n"+third+"\n"+fourth;
    }
}
