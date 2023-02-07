package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")

public class User extends Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "password")
    private String password;

    public static final int DISCONNECTED = 0;
    public static final int CONNECTED = 1;
    @Column(name = "status")
    private int status;

    public User(int id, String email, String password, int status) {
        super(id, email);
        this.password = password;
        this.status = status;
    }

    public int getUserIndex() {
        return index;
    }

    public void setUserIndex(int index) {
        this.index = index;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
