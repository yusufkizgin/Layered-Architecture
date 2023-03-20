package DataAccess;

import Entities.Instructor;

public class HibernateInstructorDao implements IInstructorDao{

    @Override
    public void add(Instructor instructor) {
        System.out.println("Hibernate ile veritabanına eklendi");
    }
}
