package practice08;

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
//==是java提供的等于比较运算符,用来比较两个变量指向的内存地址是否相同.而equals()是Object提供的一个方法
//.Object中equals()方法的默认实现就是返回两个对象==的比较结果.但是equals()可以被重写，而重写equals()必须也要重写hashCode()
//因为，在java中，对对象的存储采取了存储在哈希表中处理方法，hashcode方法是根据对象的地址转换之后返回的一个哈希值
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
