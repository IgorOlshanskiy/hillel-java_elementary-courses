package home_work_3;

import java.util.Arrays;

public class StudentAccounting {
    public static void main(String[] args) {
        String[] surnames = new String[5];
        int[][] marks = new int[5][8];
        marks[0][0] = 3;
        addStudent(surnames, "Ivanov");
        addStudent(surnames, "Petrov");
        setMark("Petrov", 5, 2, surnames, marks);
        print(surnames, marks);

    }

    private static void setMark(String names, int mark, int lessonIndex,
                                final String[] surnames, final int[][] marks) {
        int studentsIndex = -1;
        for (int i = 0; i < surnames.length; i++){
            if (surnames[i] == names){
                studentsIndex = i;
            }
        }
        if (studentsIndex == -1) {
            System.out.println("Look better");
            return;
        }
        marks[studentsIndex][lessonIndex] = mark;
    }

    private static void addStudent(String[] surname, String name) {
        for (int i = 0; i < surname.length; i++){
            if (surname[i] == null){
                surname[i] = name;
                return;
            }
        }
    }


    public static void print(String[] surname, int[][] marks){
        System.out.println(Arrays.toString(surname));
        for (int i = 0; i < marks.length; i++) {
            if (surname[i] == null){
                return;
            }
            System.out.print(surname[i] + "\t");
            for (int mark : marks[i]) {
                System.out.print(mark + " ");
            }
            System.out.println();
        }
    }

}
