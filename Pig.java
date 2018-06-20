public class Pig extends Animal {
	public Pig(String name, int weight, int age){
	    this.name = name;
        this.weight =weight;
        this.age = age;
        System.out.println("Я свинюшка!");
	}
	public void say() {
	System.out.println("Хрю-хрю");
	}
}
