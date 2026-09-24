public class HotelRoom
{
        private int roomNumber;
        private String roomType;    //Single or Double
        private int vacancyStatus; // 0 for vacant, 1 for occupied
        private double roomRate;   // nightly rate

        public HotelRoom()
        {

        }

    public int getRoomNumber()
    {
        return roomNumber;
    }

    public String getRoomType()
    {
        return roomType;
    }

    public void setRoomNumber(int roomNumber)
    {
        this.roomNumber = roomNumber;
    }

    public void setRoomType(String roomType)
    {
        this.roomType = roomType;
    }

    public int getVacancyStatus()
    {
        return vacancyStatus;
    }

    public void setVacancyStatus(int vacancyStatus)
    {
        this.vacancyStatus = vacancyStatus;
    }

    public double getRoomRate()
    {
        return roomRate;
    }

    public void setRoomRate(double roomRate)
    {
        this.roomRate = roomRate;
    }

    public void setAll(int roomNumber, String roomType, int vacancyStatus, double roomRate)
    {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.vacancyStatus = vacancyStatus;
        this.roomRate = roomRate;
    }

    public boolean isOccupied()
    {
        if (vacancyStatus == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public void setOccupied()
    {   
        if(this.isOccupied()==true)
        {
            System.out.println("Room is already occupied");
        }
        else
        {
            this.vacancyStatus = 1;
            System.out.println("Room is now occupied");
        }
    }

    public String toString()
    {
        String theString;
        theString = this.roomNumber+" "+this.roomType+" "+this.vacancyStatus+" "+this.roomRate;
        return theString;
    }
}