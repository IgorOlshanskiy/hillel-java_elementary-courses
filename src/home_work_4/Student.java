package home_work_4;

public class Student {
    String name;
    int[] marks;

    public Student(String n){
        name = n;
    }

    public void greet(){
        System.out.println("Hello my name is " + name);
    }

}
