public class Hello {
	public static void main(String[] args) {
		System.out.println("Привет жоппа! Создадим животное и свинку");
		Animal animal = new Animal("Alice", 5, 6);
		Pig pig = new Pig("Хрюня", 2, 30);
		pig.say();
        pig.say("ЧТО, БЛЕАТЬ?");
        Dog dog = new Dog();
        dog.say();
	}
}
