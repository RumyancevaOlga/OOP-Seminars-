// Создать package – service. Работу продолжаем в нем
// Создать интерфейс DataService описывающий реализацию конкретных сервисов по 
// управлению сущностями (create, read)
// Создать для сущности Student отдельный Service реализующий интерфейс DataService. 
// Create и read операции реализуются путем вызова utils методов


package Seminar_2.Service;

import Seminar_2.Data.User;

public interface DataService {
    void write(User user);

    User read(User user);

}
