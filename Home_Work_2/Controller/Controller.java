// Создать package – view. Работу продолжаем в нем
// Создать абстрактный класс  UserView, содержащий в себе метод 
// void showTheBest(List<User> userList) , нутри вызывающий абстрактный метод 
// User findTheBest(List<User> userList)
// 3.    Создать класс StudentView, унаследованный или имплементирующий UserView , 
// содержащий в себе реализация findTheBest


package Home_Work_2.Controller;

import Home_Work_2.Data.StudentGroup;
import Seminar_2.Data.Student;
import Seminar_2.Data.Teacher;
import Seminar_2.Service.DataService;
import Seminar_2.Service.StudentDataService;
import Seminar_2.Service.TeacherDataService;

public class Controller {
    private DataService studentService;
    private DataService teacherService;

    public Controller(StudentDataService studentService, TeacherDataService teacherService) {
        this.teacherService = teacherService;
        this.studentService = studentService;
    }

    public Student writeStudent (Student student) {
        studentService.write(student);
        return (Student) studentService.read(student);
    }

    public Teacher writeTeacher (Teacher teacher) {
        teacherService.write(teacher);
        return (Teacher) teacherService.read(teacher);
    }

    public StudentGroup createGroup (int groupNumber) {
        StudentGroup group = new StudentGroup(null, null, groupNumber);
        return group;
    }
}
