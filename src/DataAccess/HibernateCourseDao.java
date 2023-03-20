package DataAccess;

import Entities.Course;

public class HibernateCourseDao implements ICourseDao{

    public void add(Course course){
        System.out.println("Hibernate ile veritabanina kaydedildi.");
    }
}
