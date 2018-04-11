package practice09;

public class Klass {
    private int number = 0;
    private Student leader = null;

    public Klass() {
    }

    ;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public void assignLeader(Student student) {
        if(student.getKlass().number != this.number)
            System.out.println("It is not one of us.");
        else
            this.leader = student;
    }

    public void appendMember(Student student){
        student.getKlass().setNumber(this.number);
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }
}
