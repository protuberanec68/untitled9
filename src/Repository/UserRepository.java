package Repository;

import Model.User;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository<T extends User> {
    private final String fileName = "users.txt";

    private void writeToFile(List<User> users) throws IOException {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(users);
            objectOut.close();
        } catch (Exception exception) {
            throw exception;
        }
    }

    public void save(T user){
        List<User> users = getAllUsers();
        if (users.contains(user)) {
            return;
        }
        users.add(user);
        try {
            writeToFile(users);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void remove(T user){
        List<User> users = getAllUsers();
        users.remove(user);
        try {
            writeToFile(users);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void edit(T user){
        List<User> users = getAllUsers();
        users.removeIf(n -> (n == user));
        users.add(user);
        try {
            writeToFile(users);
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public List<User> getAllUsers(){
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            Object obj = objectIn.readObject();
            objectIn.close();
            return (List<User>) obj;
        } catch (Exception ex) {
            ex.printStackTrace();
            return new ArrayList<User>();
        }
    }
}

