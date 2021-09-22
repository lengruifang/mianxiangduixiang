package practice07;

public class Student extends Person{
    protected Klass Klass;
    public Student(String Name, int Age,Klass Klass) {
        super(Name, Age);
        this.Klass=Klass;
    }
    public Object getKlass() {
        return Klass;
    }
    public String introduce(){
        return super.introduce()+" I am a Student. I am at Class "+Klass+".";
    }
}
