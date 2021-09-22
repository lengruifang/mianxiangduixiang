package practice07;

public class Klass {
    int Number;
protected Klass (int Number){
    this.Number= Number;
}
public int getNumber(){
    return Number;
    }
    public String getDisplayName(){
        return "Class "+Number;
    }
}
