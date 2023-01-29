package Service.impls;

import Model.User;
import Service.UserService;
import Repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserRepository repository = new UserRepository();

    @Override
    public void add(User user) {
        if (user != null) {
            repository.save(user);
        } else {
            System.out.println("User is null!");
        }
    }

    @Override
    public void remove(User user) {
        if (user != null){
            repository.remove(user);
        }
    }

    @Override
    public void edit(User user) {
        if (user != null){
            repository.edit(user);
        }
    }

    @Override
    public List getAllUsers() {
        return repository.getAllUsers();
    }
}
