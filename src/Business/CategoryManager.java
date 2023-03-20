package Business;

import DataAccess.ICategoryDao;
import Entities.Category;
import Logging.ILogger;

import java.util.ArrayList;
import java.util.List;
public class CategoryManager {
    private ILogger[] loggers;
    private List<Category> categories = new ArrayList<>();
    ICategoryDao categoryDao;


    public CategoryManager(ICategoryDao categoryDao,ILogger[] loggers) {
        this.categoryDao  = categoryDao;
        this.loggers  = loggers;
    }




    public  void add(Category category)throws Exception{
        for (Category s : categories){
            if (s.getName() == category.getName()){
                throw new Exception("There is a category by the same name!");
            }
        }
        System.out.println("Kategori Eklendi!");
        categoryDao.add(category);
        categories.add(category);

        for (ILogger s : loggers) {
            s.log(category.getName());
        }
    }

}

