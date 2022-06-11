package models;
import lombok.Data;

@Data
public class Person {
    private String first_name;
    private String last_name;
    private String email;
    private String address;
    private String phoneNumber;
}
