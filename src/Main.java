import Model.Student;
import Model.Teacher;
import Model.User;
import Service.UserService;
import Service.impls.UserServiceImpl;
import View.StudentView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentView view = new StudentView();
        view.start();
    }
}
