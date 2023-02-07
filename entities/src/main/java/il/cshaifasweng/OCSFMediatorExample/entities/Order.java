package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.util.*;
/*import java.time.LocalTime;*/

@Entity
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "car_num")
    private int carNum;

    @Column(name = "customer_num")
    private int customerNum;

    @Column(name = "enter_time")
    private GregorianCalendar enterTime;

    @Column(name = "exit_time")
    private GregorianCalendar exitTime;

    @Column(name = "parking_lot_num")
    private int parking_lot_num;

    public Order(int carNum, int customerNum, GregorianCalendar enterTime, GregorianCalendar exitTime, int parking_lot_num) {
        this.carNum = carNum;
        this.customerNum = customerNum;
        this.enterTime = enterTime;
        this.exitTime = exitTime;
        this.parking_lot_num = parking_lot_num;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
    }

    public int getCustomerNum() {
        return customerNum;
    }

    public void setCustomerNum(int customerNum) {
        this.customerNum = customerNum;
    }

    public GregorianCalendar getEnterTime() {
        return enterTime;
    }

    public void setEnterTime(GregorianCalendar enterTime) {
        this.enterTime = enterTime;
    }

    public GregorianCalendar getExitTime() {
        return exitTime;
    }

    public void setExitTime(GregorianCalendar exitTime) {
        this.exitTime = exitTime;
    }

    public int getParking_lot_num() {
        return parking_lot_num;
    }

    public void setParking_lot_num(int parking_lot_num) {
        this.parking_lot_num = parking_lot_num;
    }
}
