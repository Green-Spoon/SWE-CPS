package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.util.*;
/*import java.time.LocalTime;*/

@Entity
@Table(name = "general_managers")
public class General_Manager extends Manager{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    public General_Manager(int id, String email, String password, int status, int parking_lot_num) {
        super(id, email, password, status, parking_lot_num);
    }

    public int getGeneralManagerIndex() {
        return index;
    }

    public void setGeneralManagerIndex(int index) {
        this.index = index;
    }
}
