package DataAccess;

import Entities.Instructor;

public class JdbcInstructorDao implements IInstructorDao{
    @Override
    public void add(Instructor instructor) {
        System.out.println("JDBC ile veritabanına eklendi");
    }
}
