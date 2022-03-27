package assignment3;

import java.util.ArrayList;

public class Room {
    public String roomName;
    public String location;
    public double roomRent;
    public ArrayList userlist = new ArrayList(); //tạo danh sách người dùng thuê phòng


    //contructor
    public Room() {

    }

    public Room(String roomName, String location, double roomRent, ArrayList userlist) {
        this.roomName = roomName;
        this.location = location;
        this.roomRent = roomRent;
        this.userlist = userlist;
    }

    //getter and setter
    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRoomRent() {
        return roomRent;
    }

    public void setRoomRent(double roomRent) {
        this.roomRent = roomRent;
    }

    public ArrayList getUserlist() {
        return userlist;
    }

    public void setUserlist(ArrayList userlist) {
        this.userlist = userlist;
    }

    public void display(){
        System.out.println("\nRoom information:" + roomName);
        System.out.println("Room name: " + this.roomName);
        System.out.println("Location: " + this.location);
        System.out.println("Room rent: " + this.roomRent);
        System.out.println("List of users renting rooms: " + this.userlist);
    }

    public void display2(){ //check userList khi không có người đăng kí phòng
        System.out.println("\nRoom name: " + this.roomName);
        System.out.println("Location: " + this.location);
        System.out.println("Room rent: " + this.roomRent);
        if (userlist.size() == 0){
            System.out.println("List of users renting rooms: empty room");
        } else {
            System.out.println("List of users renting rooms: "  + this.userlist);
        }
    }

}
