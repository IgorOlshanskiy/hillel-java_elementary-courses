package dictionary_homework;

public class Main {
    public static void main(String[] args){
        MyDict myDict = new MyDict();
        System.out.println();
        myDict.put("Yo dawg", "эй братан");
        myDict.put("Hello", "привет");
        myDict.put("table", "стол");
        myDict.put("this is nigger than 19", "выдуманное");
        String result = myDict.get("table");
        System.out.println(result);
    }
}
