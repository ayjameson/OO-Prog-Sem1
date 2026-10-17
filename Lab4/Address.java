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

    public String toString()
    {
        String fullAddress;
        fullAddress = this.street + " " + this.cityOrTown + " " + this.county;
        return fullAddress;
    }
}
