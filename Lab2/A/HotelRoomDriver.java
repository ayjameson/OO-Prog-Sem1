package Lab2.A; //was getting err in vsc for no package
public class HotelRoomDriver 
{
    public static void main(String[] args)
    {
        HotelRoom roomA = new HotelRoom();  //creating objects
        HotelRoom roomB = new HotelRoom();

        roomA.setRoomNumber(200);   //setting values for the objects
        roomA.setRoomType("Single");
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        System.out.println("Room A number : " + roomA.getRoomNumber());
        System.out.println("Room B number : " + roomB.getRoomNumber());
        System.out.println("Room A type : " + roomA.getRoomType());
        System.out.println("Room B type : " + roomB.getRoomType());
    }
}
    