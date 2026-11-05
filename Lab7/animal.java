public class animal
{
    private String type;
    private int age;
    private char gender;

    public animal(String t, int a, char g)
    {
        this.type = t;
        this.age = a;
        this.gender = g;
    }

    public animal()
    {

    }
    
    public void eat()
    {
        System.out.println("Animal is eating");
    }

    public void sleep()
    {
        System.out.println("Animal is sleeping");
    }

    public void makeSound()
    {
        System.out.println("A generic animal sound");
    }

    public String toString()
    {
        return "Age: " + age + " Type: " + type + " Gender: " + gender;
    }
}