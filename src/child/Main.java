package child;

public class Main {
    public static void main(String[] args) {
        Child child = new Child();
        HowToGreetable mum = new Mum();
        HowToGreetable father = new Father();

        child.setAdult(mum);

        System.out.println("бабка говорит как ты подрос");
        System.out.println(child.greet());

        System.out.println();

        child.setAdult(father);
        System.out.println("папа говорит привет");
        System.out.println(child.greet());
    }
}