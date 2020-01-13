package java23;
import java.util.Scanner;

public class Room {
    private int roomNo;
    private int roomPrice;
    private int roomFlor;
    private int roomDeLux;

    public Room(int roomNo, int roomPrice, int roomFlor, int roomDeLux) {
        this.roomNo = roomNo;
        this.roomPrice = roomPrice;
        this.roomFlor = roomFlor;
        this.roomDeLux = roomDeLux;
    }
    public Room(){

    }

    public int getRoomNo() {
        return roomNo;
    }

    public void setRoomNo(int roomNo) {
        this.roomNo = roomNo;
    }

    public int getRoomPrice() {
        return roomPrice;
    }

    public void setRoomPrice(int roomPrice) {
        this.roomPrice = roomPrice;
    }

    public int getRoomFlor() {
        return roomFlor;
    }

    public void setRoomFlor(int roomFlor) {
        this.roomFlor = roomFlor;
    }

    public int getRoomDeLux() {
        return roomDeLux;
    }

    public void setRoomDeLux(int roomDeLux) {
        this.roomDeLux = roomDeLux;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNo=" + roomNo +
                ", roomPrice=" + roomPrice +
                ", roomFlor=" + roomFlor +
                ", roomDeLux='" + roomDeLux + '\'' +
                '}';
    }
    public Room reservation() {
            Room newRoom = new Room();
            System.out.println("Enter Room Information");
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter Room Number: ");
            newRoom.setRoomNo(scanner.nextInt());

            System.out.println("Enter Room Price: ");
            newRoom.setRoomFlor(scanner.nextInt());

            System.out.println("Enter Room Flor: ");
            newRoom.setRoomPrice(scanner.nextInt());

            System.out.println("Enter how many nights did you stay : ");
            newRoom.setRoomDeLux(scanner.nextInt());

            return newRoom;
    }


}
