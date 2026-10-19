package Lab4;

public class Address
{
    private String street;
    private String cityOrTown;
    private String county;

    public Address(String street, String cityOrTown, String county)
    {
        this.street = street;
        this.cityOrTown = cityOrTown;
        this.county = county;
    }

    public String getStreet()
    {
        return this.street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getCityOrTown()
    {
        return this.cityOrTown;
    }

    public void setCityOrTown(String cityOrTown)
    {
        this.cityOrTown = cityOrTown;
    }

    public String getCounty()
    {
        return this.county;
    }

    public void setCounty(String county)
    {
        this.county = county;
    }

    public String toString()
    {
        String fullAddress;
        fullAddress = this.street + " " + this.cityOrTown + " " + this.county;
        return fullAddress;
    }
}
