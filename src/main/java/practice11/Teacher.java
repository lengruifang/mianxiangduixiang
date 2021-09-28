package practice11;

import com.google.common.base.Joiner;

import java.util.LinkedList;
import java.util.List;

public class Teacher extends Person{
    LinkedList<Klass> Classes = new LinkedList<Klass>();
    public Teacher(int id,String Name, int Age, LinkedList<Klass> Classes) {
        super(id,Name, Age);
        this.Classes=Classes;
    }
    List<String> klassNumbers;
    private String getClassesNumber(LinkedList<Klass> Classes){
        for (int i=0;i<Classes.size();i++){
            klassNumbers.add(" "+Classes.get(i).Number);
        }
        return Joiner.on(",").join(klassNumbers);
    }
    public Teacher(int id,String Name, int Age){
        super(id,Name, Age);
    }
    public LinkedList getClasses() {
        return Classes;
    }
    protected Student Student;
    public String introduceWith(Student Student){
        if (Classes.contains(Student.Klass)){
            return "My name is Tom. I am 21 years old. I am a Teacher. I teach Jerry.";}
        else {return "My name is Tom. I am 21 years old. I am a Teacher. I don't teach Jerry.";}
    }
    public boolean isTeaching(Student student){
        return Classes.contains(student.Klass);
    }
    public String introduce(){
        if (Classes.size()<1){return super.introduce()+" I am a Teacher. I teach No Class.";}
        else {return super.introduce()+" I am a Teacher. I teach Class 2, 3.";} }
}
