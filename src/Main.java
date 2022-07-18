import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        Student student1 = new FTStudent("Michal", "Maziec", 252718);
        Student student2 = new FTStudent("Bartosz", "Soczynski",252792);
        Student student3 = new PTStudent("Karol", "Chmielowski", 252933);
        Student student4 = new PTStudent("Joanna", "Florek", 252987);
        Collections.addAll(studentList, student1, student2, student3, student4);

        UserDialog.greeting();
        UserDialog.whatToDo();
        UserDialog.dialog(studentList);



    }
}