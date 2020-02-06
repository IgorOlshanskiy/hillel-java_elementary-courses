package dictionary_homework;

public class Main {
    public static void main(String[] args){
        MyDict myDict = new MyDict();
        System.out.println();
        myDict.put("Yo dawg", "эй братан");
        myDict.put("Hello", "привет");
        String result = myDict.get("Yo dawg");
        System.out.println(result);
    }
}
