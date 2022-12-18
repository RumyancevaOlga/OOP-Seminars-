// Создать package – util. Работу продолжаем в нем
// Создать классы WriterToTxt и ReaderFromTxt имеющие статичные методы для записи 
// (write) /чтения (read) в/из txt файла


package Home_Work_2.Util;

import Home_Work_2.Data.Student;
import Home_Work_2.Data.Teacher;
import Seminar_2.Data.User;

public class ReaderFromTxt {
    private String path;

    public ReaderFromTxt(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public static User read (User user) {
        return null;
    }

    public static Teacher read (Teacher teacher) {
        return null;
    }

    public static Student read (Student student) {
        return null;
    }
}
