public class HotelRoomDriver 
{
    public static void main(String[] args)
    {
        HotelRoom roomA = new HotelRoom();  //creating objects
        HotelRoom roomB = new HotelRoom();
        HotelRoom roomC = new HotelRoom();

        roomA.setRoomNumber(200);   //setting values for the objects
        roomA.setRoomType("Single");
        roomA.setVacancyStatus(1); // 0 for vacant, 1 for occupied
        roomA.setRoomRate(100.0); // setting nightly rate 
        roomB.setRoomNumber(201);
        roomB.setRoomType("Double");
        roomB.setVacancyStatus(0); 
        roomB.setRoomRate(80.0);
        roomC.setAll(202, "Single", 0, 90);
        roomB.setOccupied();    //setting room B to occupied twice to test the setOccupied method
        roomB.setOccupied();

        System.out.println("Room A number : " + roomA.getRoomNumber());
        System.out.println("Room B number : " + roomB.getRoomNumber());
        System.out.println("Room A type : " + roomA.getRoomType());
        System.out.println("Room B type : " + roomB.getRoomType());
        System.out.println("Room A vacancy status : " + roomA.getVacancyStatus());
        System.out.println("Room B vacancy status : " + roomB.getVacancyStatus());
        System.out.println("Room A rate : " + roomA.getRoomRate());
        System.out.println("Room B rate : " + roomB.getRoomRate());
        System.out.println("Room C : " + roomC.toString());  //not returning proper value fix this
    }
}
    