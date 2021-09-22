package practice08;

public class Klass {
    int Number;
    Object Leader;
    protected Klass (int Number){
        this.Number= Number;
    }
    public int getNumber(){
        return Number;
    }
    public String getDisplayName(){ return "Class "+Number; }
    protected Object assignLeader(Student Student){
       return Leader=Student;
    }
    public Object getLeader(){
        return Leader;
    }
}
