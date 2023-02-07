package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;
import java.util.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "car_num")
    private int carNum;

    @Column(name = "owner_num")
    private int ownerNum;

    @Column(name = "current_parking_spot")
    private int currentParkingSpot;

    public Car(int carNum, int ownerNum) {
        this.carNum = carNum;
        this.ownerNum = ownerNum;
        this.currentParkingSpot = -1;
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

    public int getOwnerNum() {
        return ownerNum;
    }

    public void setOwnerNum(int ownerNum) {
        this.ownerNum = ownerNum;
    }

    public int getCurrentParkingSpot() {
        return currentParkingSpot;
    }

    public void setCurrentParkingSpot(int currentParkingSpot) {
        this.currentParkingSpot = currentParkingSpot;
    }
}
