public class AnimalTest
{
	public static void main (String args[])
	{
		animal dog = new Dog("Poodle", 4, 'M');
		System.out.println(dog);
		dog.eat();
		dog.sleep();
		dog.makeSound();
		
		System.out.println();
		
		animal cat = new Cat("Tom", 2, 'F');
		System.out.println(cat);
		cat.eat();
		cat.sleep();
		cat.makeSound();

		System.out.println();

        Vet vet1 = new Vet(dog);
        vet1.vaccinate();

        System.out.println();

        Vet vet2 = new Vet(cat);
        vet2.vaccinate();

		}
}