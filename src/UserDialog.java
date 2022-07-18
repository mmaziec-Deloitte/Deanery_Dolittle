import java.util.InputMismatchException;
import java.util.List;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Scanner;

public class UserDialog {

    static DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
    static LocalDateTime now = LocalDateTime.now();


    public static void dialog (List<Student> studentList) {
        while(true){
            int choice;
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                    UserDialog.showAllStudents(studentList);
                    UserDialog.whatToDo();
                    break;
                case 2:
                    System.out.println("-- Please type in id to search:\n");
                    int choice2 = scanner.nextInt();
                    for (Student student: studentList) {
                        if(choice2 == student.getId()){
                            UserDialog.showStudent(student);
                            System.out.println("--------------------------------------------------------------------\n");
                        }
                    }
                    UserDialog.whatToDo();
                    break;
                case 3:
                    String choice3, choice4, choice6;
                    int choice5;
                    System.out.println("-- Please type in the first name:");
                    choice3 = scanner.next();

                    System.out.println("-- Please type in the second name:");
                    choice4 = scanner.next();

                    System.out.println("-- Please type in the student's ID:");
                    choice5 = scanner.nextInt();

                    System.out.println("-- Please type in the student's type:\n" +
                                       "* full --> for full-time\n" +
                                       "* part --> for part-time\n");
                    choice6 = scanner.next();

                    if(choice6.equals("full")){
                        Student newStudent = new FTStudent(choice3, choice4, choice5);
                        studentList.add(newStudent);
                    }
                    else if(choice6.equals("part")){
                        Student newStudent = new PTStudent(choice3, choice4, choice5);
                        studentList.add(newStudent);
                    }
                    UserDialog.whatToDo();
                    break;
                case 4:
                    String room;
                    System.out.println("-- Please type in the student's ID:");
                    int idCode = scanner.nextInt();
                    System.out.println("-- Please type in the correct room (A123, B123, C124 or D124):");
                    room = scanner.next().toUpperCase();
                    System.out.println("-- Please type in the specific hour to serve:");
                    int hour = scanner.nextInt();

                    for (Student student: studentList) {
                        if(idCode == student.getId()) {
                            student.serve(room, hour);
                            UserDialog.showStudent(student);
                            System.out.println("-- Room number: " + room + "\n" +
                                               "--------------------------------------------------------------------\n");
                        }
                        }
                    UserDialog.whatToDo();
                    break;

                case 5:
                    System.out.println("Have a nice day!");
                    System.exit(0);
                default:
                    throw new InputMismatchException("You've typed in the wrong type of input!");
                    }

            }
        }


    public static void greeting(){
        System.out.print("--------------------------------------------------------------------\n" +
                           "-----------------------Welcome to the Deanery!----------------------");

    }

    public static void whatToDo(){
        System.out.println("\n\n-- What would you like to do?\n" +
                "-- 1. Show all the students' details\n" +
                "-- 2. Search by ID\n" +
                "-- 3. Add a new student to our database\n" +
                "-- 4. Serve the given student from database\n" +
                "-- 5. Exit\n");
    }

    public static void showStudent(Student student){
        System.out.println("--------------------------------------------------------------------\n" +
                           "                       STUDENT <" + student.getId() + ">\n\n" +
                           "-- First Name: |   " + student.getFirstName() + "   |\n" +
                           "-- Second Name: |   " + student.getSecondName() + "   |\n\n" +
                           "-- Report generated on: " + dtf.format(now));

    }

    public static void showAllStudents(List<Student> studentList){
        for (Student student: studentList) {
            UserDialog.showStudent(student);
            System.out.println("--------------------------------------------------------------------\n");
        }
    }
}
