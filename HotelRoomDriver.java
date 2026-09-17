public class HotelRoomDriver 
{
    public static void main(String[] args)
    {
        HotelRoom roomA = new HotelRoom();
        HotelRoom roomB = new HotelRoom();

        roomA.setRoomNumber(200);
        roomA.setRoomType("Single");
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");

        System.out.println("Room A number : " + roomA.getRoomNumber());
        System.out.println("Room B number : " + roomB.getRoomNumber());
        System.out.println("Room A type : " + roomA.getRoomType());
        System.out.println("Room B type : " + roomB.getRoomType());
    }
}
