package practice08;

public class Student extends Person{
    protected Klass Klass;
    public Student(int id,String Name, int Age, Klass Klass) {
        super(id,Name,Age);
        this.Klass=Klass;
    }
    public Object getKlass() { return Klass; }
    public String introduce(){if (Klass.Leader!=null)
    {return super.introduce() + " I am a Student. I am Leader of Class 2.";}
    else {return super.introduce() + " I am a Student. I am at Class " + Klass.Number + ".";}
    }
}
