package practice03;

public class Student extends Person {
    int Klass;
    public Student(String Name, int Age,int Klass) {
        super(Name, Age);
        this.Klass=Klass;
    }
    public int getKlass() {
        return Klass;
    }
    public String introduce(){
        return "I am a Student. I am at Class "+Klass+".";
    }
}
