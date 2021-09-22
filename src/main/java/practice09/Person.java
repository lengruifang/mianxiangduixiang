package practice09;

import java.util.Objects;

public class Person {
    String Name;
    int Age;
    int id;
    public Person(int id,String Name,int Age){
        this.id=id;
        this.Name=Name;
        this.Age=Age;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Age == person.Age &&
                id == person.id &&
                Name.equals(person.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Age, id);
    }
    public  String getName(){
        return Name;
    }
    public int getAge(){
        return Age;
    }
    public String introduce() {
        return "My name is "+Name+". I am "+Age+" years old.";
    }
}
