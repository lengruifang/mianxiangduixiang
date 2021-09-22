package practice09;

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
    protected Object assignLeader(Student Student) {
            if (this.Student!=null)return Leader = Student;
    }
    try{assignLeader(this.Student);}catch(IllegalArgumentException){System.out.print("1");}
    public Object appendMember(Student Student){
        this.Student=Student;
        return this.Student;
    }
    public Object getLeader(){
        return Leader;
    }
    Student Student;
}
