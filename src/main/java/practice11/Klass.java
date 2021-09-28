package practice11;


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
//        catch(NullPointerException nullPointerException){System.out.print("It is not one of us.\n");}
        if (Student==this.Student&&Student.Klass.Number==3){
            teacherSey(1);
        }
        else if (Student==this.Student){
            this.Leader=Student;
        }else {
            System.out.print("It is not one of us.\n");
        }
    }
    public void appendMember(Student Student){
        this.Student=Student;
        teacherSey(0);
    }
    protected void teacherSey(int somevoid){
        switch (somevoid) {
            case 0:System.out.print("I am Tom. I know Jerry has joined Class 2.\n");
            break;
            case 1:System.out.print("I am Tom. I know Jerry become Leader of Class 2.\n");
            break;
        }
    }
    public Object getLeader(){
        return Leader;
    }
}
