package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.util.*;
/*import java.time.LocalTime;*/

@Entity
@Table(name = "price_change_requests")
public class Price_Change_Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "parking_lot_num")
    private int parking_lot_num;

    @Column(name = "new_immediate_hourly_price")
    private int new_immediate_hourly_price;

    @Column(name = "new_future_hourly_price")
    private int new_future_hourly_price;

    public Price_Change_Request (int parking_lot_num, int new_immediate_hourly_price, int new_future_hourly_price)
    {
        this.parking_lot_num = parking_lot_num;
        this.new_immediate_hourly_price = new_immediate_hourly_price;
        this.new_future_hourly_price = new_future_hourly_price;
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

    public int getNew_immediate_hourly_price() {
        return new_immediate_hourly_price;
    }

    public void setNew_immediate_hourly_price(int new_immediate_hourly_price) {
        this.new_immediate_hourly_price = new_immediate_hourly_price;
    }

    public int getNew_future_hourly_price() {
        return new_future_hourly_price;
    }

    public void setNew_future_hourly_price(int new_future_hourly_price) {
        this.new_future_hourly_price = new_future_hourly_price;
    }
}
