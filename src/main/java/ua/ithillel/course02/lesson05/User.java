package ua.ithillel.course02.lesson05;

public class User {

    private int age;
    private String password;
    public String userName;
    public String email;
    public boolean isActive;
    public double amountSpentMoney;

    public User() {
        this.userName = "anonymous";
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(String userName, String password) {
        this.userName = userName;
        setPassword(password);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if ((age > 0) && (age < 120)) {
            this.age = age;
        } else {
            System.out.println("Wrong age");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() >= 8) {
            this.password = password;
        } else {
            System.out.println("Password should be at least 8 symbols");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean isActive) {
        this.isActive = isActive;
    }

    public double getAmountSpentMoney() {
        return amountSpentMoney;
    }

    public void setAmountSpentMoney(double amountSpentMoney) {
        this.amountSpentMoney = amountSpentMoney;
    }

    public void addDiscount(int percent) {
        amountSpentMoney *= 1 - (double) percent / 100;
    }

    public void makePurchase(double purchasePrice) {
        System.out.println("Purchase price " + purchasePrice);
        amountSpentMoney += purchasePrice;
    }

    public void printTotalAmountOfSpentMoney() {
        System.out.println("Amount of spent money " + amountSpentMoney);
    }
}
