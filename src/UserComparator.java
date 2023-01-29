import Model.User;

import java.util.Comparator;

public class UserComparator implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        if (o1.getName() == o2.getName()) return 0;
        return -1;
    }

}
