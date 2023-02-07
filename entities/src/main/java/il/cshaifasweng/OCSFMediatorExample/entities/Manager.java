package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.util.*;
/*import java.time.LocalTime;*/

@Entity
@Table(name = "p_l_managers")
public class Manager extends Worker{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    public Manager(int id, String email, String password, int status, int parking_lot_num) {
        super(id, email, password, status, parking_lot_num);
    }

    public int getManagerIndex() {
        return index;
    }

    public void setManagerIndex(int index) {
        this.index = index;
    }
}

