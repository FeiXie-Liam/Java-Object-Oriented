package practice08;

public class Klass {
    private int number = 0;
    private Student leader = null;
    public  Klass(){};

    public Klass(int number){
        this.number = number;
    }

    public int getNumber(){
        return number;
    }

    public void assignLeader(Student student){
        this.leader = student;
    }

    public Student getLeader(){
        return leader;
    }
    public String getDisplayName(){
        return "Class "+ getNumber();
    }
}
