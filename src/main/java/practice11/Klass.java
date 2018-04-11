package practice11;

import java.util.Set;

public class Klass {
    private int number = 0;
    private Student leader = null;
    private Teacher teacher = null;

    public Klass() {
    }

    ;

    public Klass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void assignLeader(Student student) {
        if (student.getKlass().number != this.number)
            System.out.println("It is not one of us.");
        else {
            this.leader = student;
            if(this.teacher != null){
                System.out.println("I am "+this.teacher.getName()+". I know "+student.getName()+" become Leader of Class "+this.number+".");
            }
        }
    }

    public void appendMember(Student student) {
        student.getKlass().setNumber(this.number);
        if(this.teacher != null){
            System.out.println("I am "+this.teacher.getName()+". I know "+student.getName()+" has joined Class "+this.number+".");
        }
    }

    public Student getLeader() {
        return leader;
    }

    public String getDisplayName() {
        return "Class " + getNumber();
    }
}
