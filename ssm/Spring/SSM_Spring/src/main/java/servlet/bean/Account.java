package servlet.bean;

/**
 * name: 吳世祥
 * Date: 2019/5/18 13:36
 * Content:
 */
public class Account {

    private Integer id;
    private String name;
    private double money;


    private double tranfermoney;

    public double getTranfermoney() {
        return tranfermoney;
    }

    public void setTranfermoney(double tranfermoney) {
        this.tranfermoney = tranfermoney;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    public Account(Integer id, String name, double money) {
        this.id = id;
        this.name = name;
        this.money = money;
    }

    public Account() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
