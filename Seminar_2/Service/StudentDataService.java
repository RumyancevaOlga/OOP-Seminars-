package Seminar_2.Service;

import Seminar_2.Data.User;
import Seminar_2.Util.ReaderFromTxt;
import Seminar_2.Util.WriterToTxt;
import Seminar_2.Data.User;

public class StudentDataService implements DataService {
    
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
