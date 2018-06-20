public class Animal {
	String name;
	int age;
	float weight;

    public Animal(){}

	public Animal(String name, int age, int weight) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		System.out.println("Я родилось");
	}

    public void say(String some_words) {
        System.out.println(some_words);
    }    
}
