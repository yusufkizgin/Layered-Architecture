package Business;

import DataAccess.IInstructorDao;
import Entities.Instructor;
import Logging.ILogger;

public class InstructorManager {
    private ILogger[] loggers;
    IInstructorDao instructorDao;

    public InstructorManager(IInstructorDao instructorDao, ILogger[] loggers){
        this.loggers = loggers;
        this.instructorDao = instructorDao;
    }


    public void add(Instructor instructor){
        System.out.println(instructor.getName()+" Adli Egitmen Eklendi");
        instructorDao.add(instructor);

        for (ILogger s : loggers) {
            s.log(instructor.getName());
        }

    }

}
