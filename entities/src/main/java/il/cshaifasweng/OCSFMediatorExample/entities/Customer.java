package il.cshaifasweng.OCSFMediatorExample.entities;

import javax.persistence.*;

@Table(name = "customers")
public class Customer extends Person {
    public static final int INACTIVE = 0;
    public static final int ACTIVE = 1;
    public static final int PERSONAL = 0;
    public static final int BUSINESS = 1;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int index;

    @Column(name = "sub_status")
    private int sub_status;

    @Column(name = "type")
    private int type;

    @Column(name = "isWorker")
    private boolean isWorker;

    @Column(name = "money_balance")
    private int money_balance;

    public Customer(int id, String email, int sub_status, int type, boolean isWorker, int money_balance) {
        super(id, email);
        this.sub_status = sub_status;
        this.type = type;
        this.isWorker = isWorker;
        this.money_balance = money_balance;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getSub_status() {
        return sub_status;
    }

    public void setSub_status(int sub_status) {
        this.sub_status = sub_status;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public boolean getIsWorker() {
        return isWorker;
    }

    public void setWorker(boolean worker) {
        isWorker = worker;
    }

    public int getMoney_balance() {
        return money_balance;
    }

    public void setMoney_balance(int money_balance) {
        this.money_balance = money_balance;
    }

}
