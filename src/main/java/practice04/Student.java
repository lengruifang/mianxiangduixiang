package practice04;

public class Student extends Person{
    int Klass;
    public Student(String Name, int Age,int Klass) {
        super(Name, Age);
        this.Klass=Klass;
    }
    public int getKlass() {
        return Klass;
    }
    public String introduce(){
        return basicIntroduce()+" I am a Student. I am at Class "+Klass+".";
    }
}
