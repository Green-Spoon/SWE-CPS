package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
/*import java.time.LocalTime;*/

@Entity
@Table(name = "persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "id")
    private int id;

    @Column(name = "email")
    private String email;

    public Person(int id, String email) {
        super();
        this.id = id;
        this.email = email;
    }

//    public test_Person() {
//        this.id = 0;
//        this.email = "";
//    }

    //Getters and setters
    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}