package Entities;

public class Course{
    private String name;
    private double price;
    private String instructor;
    private int id;
    private String description;


    public Course(int id, String name, String description, double price, String instructor) {
        this.instructor = instructor;
        this.price = price;
        this.description = description;
        this.name = name;
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
