package View;

import Model.Student;
import Model.Teacher;
import Service.UserService;
import Service.impls.UserServiceImpl;

import java.io.BufferedReader;
import java.io.InputStreamReader;
//Меню
public class StudentView {

    private BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in));
    private UserService userService = new UserServiceImpl();

    public void start() {
        while (true) {
            System.out.println("Menu:");
            System.out.println("1 - add Student");
            System.out.println("2 - add Teacher");
            System.out.println("3 - remove Student");
            System.out.println("4 - remove Teacher");
            System.out.println("5 - print all");
            System.out.println("6 - exit");
            System.out.println("Enter command:");

            try {
                String command = reader.readLine();
                String name = "";
                switch (command) {
                    case ("1"):
                        System.out.println("Enter student name to add: ");
                        name = reader.readLine();
                        Student studentAdd = new Student(name);
                        userService.add(studentAdd);
                        break;
                    case ("2"):
                        System.out.println("Enter teacher name to add: ");
                        name = reader.readLine();
                        Teacher teacherAdd = new Teacher(name, null);
                        userService.add(teacherAdd);
                        break;
                    case ("3"):
                        System.out.println("Enter student name to remove: ");
                        name = reader.readLine();
                        Student studentRemove = new Student(name);
                        userService.remove(studentRemove);
                        break;
                    case ("4"):
                        System.out.println("Enter teacher name to remove: ");
                        name = reader.readLine();
                        Teacher teacherRemove = new Teacher(name, null);
                        userService.remove(teacherRemove);
                        break;
                    case ("5"):
                        System.out.println(userService.getAllUsers());
                        break;
                    case ("6"):
                        System.out.println("Bye");
                        return;
                    default:
                        System.out.println("Wrong command");
                        break;
                }
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }
}
