public class Dog extends animal
{
    public Dog(String t, int a, char g)
    {
        super(t, a, g);
    }

    public void wagTail()
    {
        System.out.println("Dog is wagging tail");
    }

    public void makeSound()
    {
        System.out.println("Bark Bark");
    }
}