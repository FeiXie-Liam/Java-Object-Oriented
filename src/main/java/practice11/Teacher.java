package practice11;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Teacher extends Person {
    private Set<Klass> classes;

    public Teacher(int id, String name, int age, Set<Klass> classes) {
        super(id, name, age);
        this.classes = classes;
        appendTeacher(classes);
    }

    private void appendTeacher(Set<Klass> classes) {
        for (Klass klass :
                classes) {
            klass.setTeacher(this);
        }
    }


    public Teacher(int id, String name, int age){
        super(id, name, age);
        classes = new HashSet<>();
    }

    public Set<Integer> getClassesNumbers() {
        Set<Integer> classesNumbers = new HashSet<>();
        for (Klass klass :
                classes) {
            classesNumbers.add(klass.getNumber());
        }
        return classesNumbers;
    }

    public Set<Klass> getClasses(){
        return classes;
    }

    public String introduce() {
        if (classes.size() == 0)
            return super.introduce() + " I am a Teacher. I teach No Class.";
        else{
            String str = getClassesNumbers().stream().map(x->x.toString()).collect(Collectors.joining(", "));
            return super.introduce() + " I am a Teacher. I teach Class " + str + ".";
        }
    }

    public String introduceWith(Student student){
        if (isTeaching(student)) {
            return super.introduce() + " I am a Teacher. I teach "+student.getName()+".";
        }
        else
            return super.introduce() + " I am a Teacher. I don't teach "+student.getName()+".";
    }

    public boolean isTeaching(Student student){
        return getClassesNumbers().contains(student.getKlass().getNumber());
    }
}
