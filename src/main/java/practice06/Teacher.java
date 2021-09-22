package practice06;

public class Teacher extends Person{
    int Klass;
    public Teacher(String Name, int Age,int Klass) {
        super(Name, Age);
        this.Klass=Klass;
    }
    public Teacher(String Name, int Age){
        super(Name, Age);
        this.Klass=0;
    }
    public int getKlass() {
        return Klass;
    }
    public String introduce(){
        if (Klass==0){return super.introduce()+" I am a Teacher. I teach No Class.";}
        else {return super.introduce()+" I am a Teacher. I teach Class "+Klass+".";} }

}
