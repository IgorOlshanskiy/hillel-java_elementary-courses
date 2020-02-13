package child;

public class Child {
    private HowToGreetable adult;

    public void setAdult(HowToGreetable adult) {
        this.adult = adult;
    }

    public String greet(){
        //return "Hello";
        return adult.howToGreet();
    }
}
