package assignment3;

public class User {
    String name;
    public String email;
    public int phone;
    public int age;
    public double money;

    Room room; //đặt room cho class Room

    public User() {

    }

    public User(String name, String email, int phone, int age, float money) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.age = age;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    public void checkMoney() {
        double roomRent = this.room.roomRent;
        if (money > roomRent) {
            System.out.println("User " + this.name + " has enough money to rent a room.");
        } else {
            System.out.println("User " + this.name + " has not enough money to rent a room.");
        }
    }

}
