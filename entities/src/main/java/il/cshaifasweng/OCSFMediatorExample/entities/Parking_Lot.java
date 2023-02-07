package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;

@Entity
@Table(name = "parking_lots")

public class Parking_Lot {

    public static final int ROW_NUM = 3;
    public static final int FLOOR_NUM = 3;
    public static final int IMMEDIATE_HOURLY_PRICE = 8;
    public static final int FUTURE_HOURLY_PRICE = 7;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "row_num")
    private int row_num;                // unchanging

    @Column(name = "floor_num")
    private int floor_num;              // unchanging

    @Column(name = "col_num")
    private int col_num;

    @Column(name = "vacant_num")
    private int vacant_num;

    @Column(name = "occupied_num")
    private int occupied_num;

    @Column(name = "unavailable_num")
    private int unavailable_num;

    @Column(name = "immediate_hourly_price")
    private int immediate_hourly_price;

    @Column(name = "future_hourly_price")
    private int future_hourly_price;


    public Parking_Lot(int col_num) {
        this.row_num = ROW_NUM;
        this.floor_num = FLOOR_NUM;
        this.col_num = col_num;
        this.vacant_num = row_num * floor_num * col_num;
        this.occupied_num = 0;
        this.unavailable_num = 0;
        this.immediate_hourly_price = IMMEDIATE_HOURLY_PRICE;
        this.future_hourly_price = FUTURE_HOURLY_PRICE;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int setRow_num() {
        return row_num;
    }

    public void setRow_num(int row_num) {
        this.row_num = row_num;
    }

    public int setFloor_num() {
        return floor_num;
    }

    public void setFloor_num(int floor_num) {
        this.floor_num = floor_num;
    }

    public int getCol_num() {
        return col_num;
    }

    public void setCol_num(int col_num) {
        this.col_num = col_num;
    }

    public int getVacant_num() {
        return vacant_num;
    }

    public void setVacant_num(int vacant_num) {
        this.vacant_num = vacant_num;
    }

    public int getOccupied_num() {
        return occupied_num;
    }

    public void setOccupied_num(int occupied_num) {
        this.occupied_num = occupied_num;
    }

    public int getUnavailable_num() {
        return unavailable_num;
    }

    public void setUnavailable_num(int unavailable_num) {
        this.unavailable_num = unavailable_num;
    }

    public int getImmediate_hourly_price() {
        return immediate_hourly_price;
    }

    public void setImmediate_hourly_price(int immediate_hourly_price) {
        this.immediate_hourly_price = immediate_hourly_price;
    }

    public int getFuture_hourly_price() {
        return future_hourly_price;
    }

    public void setFuture_hourly_price(int future_hourly_price) {
        this.future_hourly_price = future_hourly_price;
    }
}
