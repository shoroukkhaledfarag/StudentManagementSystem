package models;
import lombok.Data;
import java.util.List;

@Data
public class Student extends Person{
    private int fee;
    private List<String> courses;
}
