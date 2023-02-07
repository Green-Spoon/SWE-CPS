package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "parking_spots")

public class Parking_Spot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "parking_lot_num")
    private int parking_lot_num;

    @Column(name = "row")
    private int row;

    @Column(name = "floor")
    private int floor;

    @Column(name = "col")
    private int col;

    public static final int OCCUPIED = 0;
    public static final int VACANT = 1;
    public static final int UNAVAILABLE = -1;
    @Column(name = "status")
    private int status;

    @Column(name = "car_num")
    private int carNum;

    @Column(name = "enter_time")
    private GregorianCalendar enterTime;

    @Column(name = "exit_time")
    private GregorianCalendar exitTime;

    public Parking_Spot(int parking_lot_num, int row, int floor, int col) {
        this.parking_lot_num = parking_lot_num;
        this.row = row;
        this.floor = floor;
        this.col = col;
        this.status = VACANT;
        this.carNum = 0;
        this.enterTime = null;
        this.exitTime = null;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getParking_lot_num() {
        return parking_lot_num;
    }

    public void setParking_lot_num(int parking_lot_num) {
        this.parking_lot_num = parking_lot_num;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getCarNum() {
        return carNum;
    }

    public void setCarNum(int carNum) {
        this.carNum = carNum;
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
}
