import Business.CategoryManager;
import Business.CoursesManager;
import Business.InstructorManager;
import DataAccess.HibernateCategoryDao;
import DataAccess.HibernateCourseDao;
import DataAccess.JdbcInstructorDao;
import Entities.Category;
import Entities.Course;
import Entities.Instructor;
import Logging.DataBaseLogger;
import Logging.FileLogger;
import Logging.ILogger;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)throws Exception {
        ILogger[] loggers = new ILogger[]{new DataBaseLogger(), new FileLogger()};

        Category category = new Category(01,"Cyber Security");
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(),loggers);
        categoryManager.add(category);
        Category category1 = new Category(02, "Cyber Security");
        //Hata Fırlatır!
        // categoryManager.add(category1);

        System.out.println("------------------------------------------------------------------------------------");

        Course course1 = new Course(01,"Yazilim Gelistirici Yetistirme Kampi .NET","",100,"Engin Demiroğ");
        CoursesManager coursesManager = new CoursesManager(new HibernateCourseDao(),loggers);
        coursesManager.add(course1);

        System.out.println("-------------------------------------------------------------------------------------");

        Instructor instructor1 = new Instructor("Programlama","Engin Demiroğ",01);
        InstructorManager instructorManager = new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor1);






    }
}