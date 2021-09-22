package practice04;

public class Person {
    String Name;
    int Age;
    public Person(String Name,int Age){
        this.Name=Name;
        this.Age=Age;
    }
    public String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String basicIntroduce() {
        return "My name is "+Name+". I am "+Age+" years old.";
    }
    public String introduce(){
        return basicIntroduce();
    }
}
