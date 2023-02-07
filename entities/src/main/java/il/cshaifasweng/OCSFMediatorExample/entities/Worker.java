package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
/*import java.time.LocalTime;*/

@Entity
@Table(name = "p_l_workers")
public class Worker extends User{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "parking_lot_num")
    private int parking_lot_num;


    public Worker(int id, String email, String password, int status, int parking_lot_num) {
        super(id, email, password, status);
        this.parking_lot_num = parking_lot_num;
    }

    public int getWorkerIndex() {
        return index;
    }

    public void setWorkerIndex(int index) {
        this.index = index;
    }

    public int getParking_lot_num() {
        return parking_lot_num;
    }

    public void setParking_lot_num(int parking_lot_num) {
        this.parking_lot_num = parking_lot_num;
    }
}
