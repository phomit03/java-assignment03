package assignment3;

public class Main {
    public static void main(String[] args) {
        //thông tin người dùng 1
        User user1 = new User();
        user1.name = "Nguyen Xuan A";
        user1.age = 15;
        user1.email = "123@gmail.com";
        user1.phone = 11111;
        user1.money = 800.000;
        //thông tin người dùng 2
        User user2 = new User();
        user2.name = "Nguyen Xuan B";
        user2.age = 16;
        user2.email = "2354@gmail.com";
        user2.phone = 99999;
        user2.money = 400.000;
        //thông tin người dùng 3
        User user3 = new User();
        user3.name = "Nguyen Xuan C";
        user3.age = 17;
        user3.email = "gsdagg@gmail.com";
        user3.phone = 66666;
        user3.money = 200.000;
        //thông tin người dùng 4
        User user4 = new User();
        user4.name = "Nguyen Xuan D";
        user4.age = 18;
        user4.email = "abc@gmail.com";
        user4.phone = 88888;
        user4.money = 700.000;

        System.out.println("List of rooms for rent:");
        //Thông tin phòng 01
        Room room1 = new Room();
        room1.roomName = "A01";
        room1.location = "Dong Da";
        room1.roomRent = 500.000;
        room1.userlist.add(user1.name); //Thêm người (user) vào danh sách thuê phòng
        room1.display();    //hiển thị
        user1.room = room1;     //check người dùng có đủ tiền hay không
        user1.checkMoney();

        //Thông tin phòng 02
        Room room2 = new Room();
        room2.roomName = "A02";
        room2.location = "Cau Giay";
        room2.roomRent = 300.000;
        room2.userlist.add(user2.name);//Thêm người (user) vào danh sách thuê phòng
        room2.userlist.add(user3.name);//Thêm người (user) vào danh sách thuê phòng
        room2.display();

        user2.room = room2;     //check người dùng có đủ tiền hay không
        user2.checkMoney();
        user3.room = room2;
        user3.checkMoney();

        //Thông tin phòng 03
        Room room3 = new Room();
        room3.roomName = "A03";
        room3.location = "Thanh Xuan";
        room3.roomRent = 600.000;
        room3.userlist.add(user4.name);//Thêm người (user) vào danh sách thuê phòng
        room3.display();
        user4.room = room3;     //check người dùng có đủ tiền hay không
        user4.checkMoney();

        //Xoá 1 người khỏi danh sách khi đã thuê phòng xong
        System.out.println("\nRoom information after user pay is: ");
        room1.userlist.remove(0);
        room1.display2();
        room2.userlist.remove(1);
        room2.display2();
        room3.userlist.remove(0);
        room3.display2();
    }

}
