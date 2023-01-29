package Controller;

import Model.Student;
import Service.UserService;
import Service.impls.UserServiceImpl;
//Контроллер
public class StudentController {
    private UserService userService = new UserServiceImpl();
    public void getStudentInfo(String name, float grade, int year){
        userService.add(new Student(name,grade,year));

    }
}
