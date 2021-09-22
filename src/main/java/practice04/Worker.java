package practice04;

public class Worker extends Person {
    public Worker(String Name, int Age) {
        super(Name, Age);
    }
    public String introduce() {
        return basicIntroduce()+" I am a Worker. I have a job.";
    }
}
