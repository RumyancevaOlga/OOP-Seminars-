package Home_Work_2.Service;

import Seminar_2.Data.User;
import Seminar_2.Util.ReaderFromTxt;
import Seminar_2.Util.WriterToTxt;

public class TeacherDataService implements DataService {
    @Override
    public void write(User user) {
        WriterToTxt.write(user);
    }

    @Override
    public User read(User user) {
        return ReaderFromTxt.read(user);
    }
}
