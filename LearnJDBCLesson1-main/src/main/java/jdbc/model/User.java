package jdbc.model;

import lombok.NoArgsConstructor;


public class User {
    private Long id;

    private String firstName;

    private String lastName;

    private byte age;


    public User(){

     }

    public User(String firstName, String lastName, byte age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(Byte age) {
        this.age = age;
    }

   @Override
    public String toString() {
       return "User{" +
                "id=" + id +
               ", firstName='" + firstName + '\'' +
               ", lastName='" + lastName + '\'' +
                ", age=" + age +
               '}';
    }
}
