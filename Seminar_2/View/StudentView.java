package Seminar_2.View;

import java.util.List;

import Seminar_2.Data.User;

public class StudentView extends UserView{

    @Override
    protected User findTheBest(List<User> userList) {
        User user = userList.get(0);
        return user;
    }
}
