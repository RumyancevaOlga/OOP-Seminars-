// Создать package – view. Работу продолжаем в нем
// Создать абстрактный класс  UserView, содержащий в себе метод 
// void showTheBest(List<User> userList) , внутри вызывающий абстрактный 
// метод User findTheBest(List<User> userList)
// 3.    Создать класс StudentView, унаследованный или имплементирующий UserView , 
// содержащий в себе реализация findTheBest


package Home_Work_2.View;

import java.util.List;
import Seminar_2.Data.User;

public abstract class UserView {
    public void showTheBest(List <User> userList) {
        System.out.println(findTheBest(userList));
    }

    protected abstract User findTheBest(List<User> userList);
}
