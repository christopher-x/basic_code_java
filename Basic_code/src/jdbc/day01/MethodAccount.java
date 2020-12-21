package jdbc.day01;

import java.util.List;

public class MethodAccount {
    private int id;
    private String name;
    private int balance;

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "MethodAccount{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}
