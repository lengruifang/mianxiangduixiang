package practice09;

public class Klass {
    int Number;
    Object Leader;
    Student Student;
    protected Klass (int Number){
        this.Number= Number;
    }
    public int getNumber(){
        return Number;
    }
    public String getDisplayName(){ return "Class "+Number; }
    protected void assignLeader(Student Student) {
//        this.Student=Student;
//        try{Leader=this.Student;}
//        catch(NullPointerException nullPointerException){System.out.print("It is not one of us.");}
        if (Student==this.Student){
            this.Leader=Student;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public Object appendMember(Student Student){
        this.Student=Student;
        return this.Student;
    }
    public Object getLeader(){
        return Leader;
    }
}
