package practice09;

public class Teacher extends Person{
    private Klass Klass;
    public Teacher(int id,String Name, int Age, Klass Klass) {
        super(id,Name, Age);
        this.Klass=Klass;
    }
    public Teacher(int id,String Name, int Age){
        super(id,Name, Age);
    }
    public Object getKlass() {
        return Klass;
    }
    protected Student Student;
    public String introduceWith(Student Student){
        if (Student.getKlass()==this.Klass){
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";}
        else {return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";}
    }
    public String introduce(){
        if (Klass==null){return super.introduce()+" I am a Teacher. I teach No Class.";}
        else {return super.introduce()+" I am a Teacher. I teach Class "+Klass.Number+".";} }
}
