package DataAccess;

import Entities.Category;

public class JdbcCategoryDao implements ICategoryDao {
    @Override
    public void add(Category category) {
        System.out.println("JDBC ile veritabanına eklendi");

    }
}
