package DataAccess;

import Entities.Course;

public class JdbcCourseDao implements ICourseDao{
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
