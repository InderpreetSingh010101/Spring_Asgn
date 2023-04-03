package Q3_4_5_7;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Size;

public class Employee {

    private int id ;
    @Size(min = 2 , message = "Size Should be More then 2 character")
    private String name ;

    @Max(value = 100 , message = "age should be less then 100")
    private int age ;

    public Employee(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
