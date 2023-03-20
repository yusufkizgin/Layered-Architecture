package Business;

import DataAccess.ICourseDao;
import Entities.Category;
import Entities.Course;
import Logging.ILogger;

import java.util.ArrayList;
import java.util.List;

public class CoursesManager {
    private List<Course> courses = new ArrayList<>();
    ICourseDao courseDao;
    private ILogger[] loggers;

    public CoursesManager(ICourseDao courseDao, ILogger[] loggers){
        this.courseDao = courseDao;
        this.loggers =loggers;
    }


    public void add(Course course) throws Exception {
        for (Course s : courses){
            if(s.getName() == course.getName()){
                throw new Exception("Kurs Adı Aynı Olamaz!!");
            }
        }
        if (course.getPrice()<0){
            throw new Exception("Kurs Fiyatı Sifirdan Kucuk Olamaz!");
        }
        System.out.println(course.getName() + " Adli Kurs Eklendi!");
        courses.add(course);
        courseDao.add(course);
        for (ILogger s : loggers) {
            s.log(course.getName());
        }

    }
}
