// Создать package – util. Работу продолжаем в нем
// Создать классы WriterToTxt и ReaderFromTxt имеющие статичные методы для записи 
// (write) /чтения (read) в/из txt файла


package Seminar_2.Util;

import Seminar_2.Data.User;

public class ReaderFromTxt {
    private String path;

    public ReaderFromTxt() {
        super();
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
}
