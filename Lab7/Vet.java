public class Vet extends animal
{
    private String name = "John";
    animal a;

    public Vet(animal a)
    {
        super();
        this.a = a;
    }

    public void vaccinate()
    {
        if(a instanceof Dog)
        {
            System.out.println(name + " is vaccinating...");
            System.out.println("Dog has been vaccinated.");
        }
        else
        {
            System.out.println(name + " is vaccinating...");
            System.out.println("Cat has been vaccinated.");
        }
    }
}